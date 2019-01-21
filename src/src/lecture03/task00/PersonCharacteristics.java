package lecture03.task00;

import java.util.Scanner;

public class PersonCharacteristics {

    public static void main(String[] args) {

        final short CURRENT_YEAR = 2018;

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the Personal characteristics ");
        String firstName = sc.nextLine();
        String familyName = sc.nextLine();
        short yearBorn = sc.nextShort();
        float weight = sc.nextFloat();
        short height = sc.nextShort();
        sc.nextLine();
        String profesion = sc.nextLine();

        short age = (short) (CURRENT_YEAR - yearBorn);

        if (age < 18 ) {

        }

        System.out.printf("%s %s is %d years old. he was born in %d. His weight is %.1f kg and he is %d cm tall. He is a %s.",
                firstName, familyName, age, yearBorn, weight, height, profesion );



    }

}
