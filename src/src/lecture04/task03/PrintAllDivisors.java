package lecture04.task03;

import java.util.Scanner;

public class PrintAllDivisors {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number here : ");
        int number = scanner.nextInt();
        System.out.println("The Divisors of " + number + " are : ");
        for (int i = 1; i <= number ; i++) {
            if (number % i == 0) {
                System.out.print(" " + i);
            }
        }

    }
}
