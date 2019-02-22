package lecture04.task12;

import java.util.Scanner;

public class PrintFirstDigit {

    public static void main(String[] args) {


        int number;
        int firstDigit;
        Scanner sc = new Scanner(System.in);

        System.out.print(" Please Enter a number : ");
        number = sc.nextInt();
        firstDigit = number;

        while ( firstDigit >= 10) {
            firstDigit = firstDigit / 10;
        }
        System.out.println("First Digit of number is :" + firstDigit);
    }


}
