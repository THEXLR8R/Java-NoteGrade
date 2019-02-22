package lecture03.task02;

import java.util.Scanner;

public class AdultChecker {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age :");
        int age = scanner.nextInt();

        if (age < 0) {
            System.out.println("error");
        } else {
            boolean isAdult = age >= 18;

            System.out.println(isAdult);
        }



    }
}
