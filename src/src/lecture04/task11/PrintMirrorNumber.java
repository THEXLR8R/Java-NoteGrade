package lecture04.task11;

import java.util.Scanner;

public class PrintMirrorNumber {

    public static void main(String[] args) {

        int number;
        int mirrorNumber =0;
        System.out.println("Please enter the number here : ");

        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();

        while (number != 0) {
            mirrorNumber = mirrorNumber * 10;
            mirrorNumber = mirrorNumber + number % 10;
            number = number / 10;
        }

        System.out.println("Mirror number is : " + mirrorNumber);



    }
}
