package lecture08.task00;

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
            SecondaryEducation education = parseEducation(educationDetails);

            person.addEducation(education);
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

    static SecondaryEducation parseEducation(String[] split) {

        String institution = split[0];
        LocalDate enrollmentDate = LocalDate.parse(split[1], formatter);
        LocalDate graduationDate = LocalDate.parse(split[2], formatter);

        SecondaryEducation education = new SecondaryEducation(institution, enrollmentDate, graduationDate);

        if (split.length == 4) {
            double grade = Double.parseDouble(split[3]);
            education.graduatedWith(grade);
        }

        return education;
    }


}
