package lecture13.task00;

import lecture13.task00.education.*;
import lecture13.task00.insurance.SocialInsurance;

import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PersonCharacteristics {

    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d.M.yyyy");

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        Person[] people = new Person[n];
        for (int i = 0; i < n; i++) {
            String line1 = scanner.nextLine();
            Person person = parsePersonLine(line1);

            String line2 = scanner.nextLine();
            List<SocialInsurance> records = parseSocialInsuranceLine(line2);

            person.addSocialInsuranceRecord(records);

            people[i] = person;
        }

        for (Person person : people) {
            System.out.println(person.getInfo());
        }
    }

    static Person parsePersonLine(String line) {
        String[] split = line.split(";");

        String[] personDetails = Arrays.copyOfRange(split, 0, 5);
        String[] educationDetails = Arrays.copyOfRange(split, 5, split.length);

        Person person = parsePerson(personDetails);
        Education education = parseEducation(educationDetails);

        person.setEducation(education);

        return person;
    }

    static List<SocialInsurance> parseSocialInsuranceLine(String line) {

        String[] split = line.split(";");

        List<SocialInsurance> records = new ArrayList<>();

        for (int i = 0; i < split.length; i += 3) {

            double amount = Double.parseDouble(split[i]);
            int year = Integer.parseInt(split[i + 1]);
            int month = Integer.parseInt(split[i + 2]);

            records.add(new SocialInsurance(amount, YearMonth.of(year, month)));
        }

        return records;
    }

    static Person parsePerson(String[] split) {

        String firstName = split[0];
        String lastName = split[1];
        char gender = split[2].charAt(0);
        int height = Integer.parseInt(split[3]);
        LocalDate birthday = LocalDate.parse(split[4], formatter);

        return new Person(firstName, lastName, Gender.of(gender), height, birthday);
    }

    static Education parseEducation(String[] split) {

        String institutionType = split[0];
        String institution = split[1];
        LocalDate enrollmentDate = LocalDate.parse(split[2], formatter);
        LocalDate graduationDate = LocalDate.parse(split[3], formatter);

        Education education = chooseEducation(
                EducationDegree.of(institutionType.charAt(0)),
                institution,
                enrollmentDate,
                graduationDate);

        if (split.length == 5) {
            if (split[4].isEmpty()) {
                ((PrimaryEducation) education).graduate();
            } else {
                double grade = Double.parseDouble(split[4]);
                ((GradedEducation) education).graduate(grade);
            }
        }

        return education;
    }

    private static Education chooseEducation(
            EducationDegree institutionType, String institution, LocalDate enrollmentDate, LocalDate graduationDate) {

        switch (institutionType) {
            case PRIMARY:
                return new PrimaryEducation(institution, enrollmentDate, graduationDate);
            case SECONDARY:
                return new SecondaryEducation(institution, enrollmentDate, graduationDate);
            case DOCTORATE:
            case MASTER:
            case BACHELOR:
                return new HigherEducation(institution, enrollmentDate, graduationDate);
            default:
                throw new IllegalArgumentException("Unrecognized education code.");
        }
    }

}
