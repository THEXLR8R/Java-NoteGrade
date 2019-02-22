package lecture13.task00;

import lecture13.task00.education.Education;
import lecture13.task00.insurance.SocialInsurance;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class Person {

    private static final LocalDate EARLIEST_DATE_ALLOWED = LocalDate.of(1900, 1, 1);

    private final LocalDate birthday;

    private String firstName;
    private String lastName;
    private Gender gender;
    private int height;
    private Education education;

    private final List<SocialInsurance> socialInsurance;

    Person(String firstName, String lastName, Gender gender, int height, LocalDate birthday) {

        validateBirthday(birthday);
        validateName(firstName, "first");
        validateName(lastName, "last");
        validateHeight(height);

        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.height = height;
        this.birthday = birthday;
        this.socialInsurance = new ArrayList<>();
    }

    int getAge() {
        return (int) birthday.until(LocalDate.now(), ChronoUnit.YEARS);
    }

    String getInfo() {

        String result = String.format("%s %s is %d years old.", firstName, lastName, getAge());
        result += String.format(" %s was born in %d.", gender.getPronoun(), birthday.getYear());
        result += String.format(" %s %s.", gender.getPronoun(), education.toString());

        if (isUnderAged()) {
            result += String.format(" %s %s is under-aged.", firstName, lastName);
        }

        return result;
    }

    boolean isUnderAged() {
        return getAge() < 18;
    }

    String getFirstName() {
        return firstName;
    }

    String getLastName() {
        return lastName;
    }

    Gender getGender() {
        return gender;
    }

    LocalDate getBirthday() {
        return birthday;
    }

    int getHeight() {
        return height;
    }

    Education getEducation() {
        return education;
    }

    void setEducation(Education education) {
        this.education = education;
    }

    void addSocialInsuranceRecord(List<SocialInsurance> record) {
        this.socialInsurance.addAll(record);
    }

    private void validateName(String firstName, String propertyName) {
        if (firstName == null || firstName.isEmpty()) {
            throw new IllegalArgumentException("Expected non-empty " + propertyName + " name.");
        }
    }

    private void validateHeight(int height) {
        if (height < 40 || 300 < height) {
            throw new IllegalArgumentException("Expected height is between 40 and 300 cm.");
        }
    }

    private void validateBirthday(LocalDate birthday) {
        if (birthday.isBefore(EARLIEST_DATE_ALLOWED) || birthday.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("Date of birth is expected to be after 01.01.1900 and before now.");
        }
    }


}
