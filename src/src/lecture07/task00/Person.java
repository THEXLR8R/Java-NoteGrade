package lecture07.task00;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Person {
    final LocalDate birthday;

    String firstName;
    String lastName;
    char gender;
    int height;

    SecondaryEducation education;

    Person(String firstName, String lastName, char gender, int height, LocalDate birthday) {

        setFirstName(firstName);
        setLastName(lastName);
        setGender(gender);
        setHeight(height);

        this.birthday = birthday;
    }

    int getAge() {
        return (int) birthday.until(LocalDate.now(), ChronoUnit.YEARS);
    }

    String getInfo() {

        String heOrShe;

        if (gender == 'M') {
            heOrShe = "He";
        } else {
            heOrShe = "She";
        }

        String result = String.format("%s %s is %d years old.", firstName, lastName, getAge());
        result += String.format(" %s was born in %d.", heOrShe, birthday.getYear());
        result += String.format(" %s started %s on %s", heOrShe, education.getInstitutionName(), education.getEnrollmentDate());

        if (education.hasGraduated()) {
            result += String.format(" and finished on %s with a grade of %.3f.",
                    education.getGraduationDate(), education.getFinalGrade());
        } else {
            result += String.format(" and is supposed to graduate on %s.",
                    education.getGraduationDate());
        }

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

    void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    String getLastName() {
        return lastName;
    }

    void setLastName(String lastName) {
        this.lastName = lastName;
    }

    char getGender() {
        return gender;
    }

    void setGender(char gender) {
        this.gender = gender;
    }

    LocalDate getBirthday() {
        return birthday;
    }

    int getHeight() {
        return height;
    }

    void setHeight(int height) {
        this.height = height;
    }

    void addEducation(SecondaryEducation education) {
        this.education = education;
    }

}
