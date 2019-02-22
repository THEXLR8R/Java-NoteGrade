package lecture06.task00;

import java.util.Scanner;

public class PersonCharacteristics {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        Person[] people = new Person[n];
        for (int i = 0; i < n; i++) {
            people[i] = parsePerson(scanner);
        }

        for (Person person : people) {
            System.out.println(person.getInfo());
        }
    }

    private static Person parsePerson(Scanner sc) {

        String firstName = sc.nextLine();
        String lastName = sc.nextLine();
        char gender = sc.nextLine().toCharArray()[0];
        short yearBorn = Short.parseShort(sc.nextLine());
        float weight = Float.parseFloat(sc.nextLine());
        short height = Short.parseShort(sc.nextLine());
        String occupation = sc.nextLine();

        float[] grades = new float[Person.gradesCount];
        for (int j = 0; j < Person.gradesCount; j++) {
            float grade = sc.nextFloat();
            grades[j] = grade;
        }

        sc.nextLine();

        return new Person(firstName, lastName, yearBorn, gender, weight, height, occupation, grades);

    }
}
