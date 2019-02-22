package lecture10.task00;

import lecture10.task00.education.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;

public class PersonCharacteristics {

    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d.M.yyyy");

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        Person[] people = new Person[n];
        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            String[] split = line.split(";");

            String[] personDetails = Arrays.copyOfRange(split, 0, 5);
            String[] educationDetails = Arrays.copyOfRange(split, 5, split.length);

            Person person = parsePerson(personDetails);
            Education education = parseEducation(educationDetails);

            person.setEducation(education);
            people[i] = person;
        }

        for (Person person : people) {
            System.out.println(person.getInfo());
        }
    }

    static Person parsePerson(String[] split) {

        String firstName = split[0];
        String lastName = split[1];
        char gender = split[2].charAt(0);
        int height = Integer.parseInt(split[3]);
        LocalDate birthday = LocalDate.parse(split[4], formatter);

        return new Person(firstName, lastName, gender, height, birthday);
    }

    static Education parseEducation(String[] split) {

        String institutionType = split[0];
        String institution = split[1];
        LocalDate enrollmentDate = LocalDate.parse(split[2], formatter);
        LocalDate graduationDate = LocalDate.parse(split[3], formatter);

        Education education = chooseEducation(institutionType, institution, enrollmentDate, graduationDate);

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
            String institutionType, String institution, LocalDate enrollmentDate, LocalDate graduationDate) {

        switch (institutionType) {
            case "P":
                return new PrimaryEducation(institution, enrollmentDate, graduationDate);
            case "S":
                return new SecondaryEducation(institution, enrollmentDate, graduationDate);
            case "D":
            case "M":
            case "B":
                return new HigherEducation(institution, enrollmentDate, graduationDate);
            default:
                throw new IllegalArgumentException("Unrecognized education code.");
        }
    }

}
