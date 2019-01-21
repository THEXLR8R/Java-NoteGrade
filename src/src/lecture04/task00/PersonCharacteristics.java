package lecture04.task00;

import java.util.Scanner;

public class PersonCharacteristics {

    public static void main (String [] args) {

            short currentYear = 2018;
            short yearBorn;
            double weight;
            double height;
            String profession;
            int age;

            System.out.println("Put all information here :");

            Scanner sc = new Scanner(System.in);

            int info = sc.nextInt();
            sc.nextLine();

            for(
                    int i = 0;i<info;i++)
            {
                String firstName = sc.nextLine();
                String familyName = sc.nextLine();

                do {
                    yearBorn = sc.nextShort();
                } while ((1900 <= yearBorn) && (yearBorn >= currentYear));

                do {
                    weight = sc.nextDouble();
                } while ((40 <= weight) && (weight >= 400));

                do {
                    height = sc.nextDouble();
                } while ((20 <= height) && (height >= 250));

                profession = sc.nextLine();

                age = (yearBorn - currentYear);

                if (age < 18) {
                    System.out.println(" " + firstName + " " + familyName + " is under aged!");
                }
                System.out.printf(
                        " %s  %s is %d years olf. He is born in %d ." + " His wejght is %f and he is %d cm tall. He is a %s.%n",
                        firstName, familyName, age, yearBorn, weight, height, profession);
            }
        }

}
