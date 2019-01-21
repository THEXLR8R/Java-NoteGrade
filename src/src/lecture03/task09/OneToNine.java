package lecture03.task09;

import java.util.Scanner;

public class OneToNine {

    /*
     * Write a program that applies bonus score to given score in range [1...9] by the following rules
     *  1 - if the score is between 1 and 3 the program multiplies it by 10
     *  2 - if the score is between 4 and 6 the program multiplies it by 100
     *  3 - if the score is between 7 and 9 the program multiplies it by 1000
     *  4 - if the score is less than 0 or more than 9 the program prints "Invalid score"
     *
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number here :");
        int number = sc.nextInt();

        if (number <= 0 || number > 9) {
            System.out.println("Invalid score!");
        }
        if (number >= 1 && number <= 3) {
            System.out.println("Now number is : " + number * 10);
        }
        if (number >= 4 && number <= 6) {
            System.out.println("Now number is : " + number * 100);
        }
        if (number >= 7 && number <= 9) {
            System.out.println("Now number is : " + number * 1000);
        }
        System.out.println("Done !!!");

    }
}
