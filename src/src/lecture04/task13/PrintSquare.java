package lecture04.task13;

import java.util.Scanner;

public class PrintSquare {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();


        for (int columnIndex = 0; columnIndex < size; columnIndex++) {
            System.out.print("* ");
        }

        System.out.println();


        for (int rowIndex = 1; rowIndex < size - 1; rowIndex++) {
            System.out.print("* ");

            for (int columnIndex = 1; columnIndex < size - 1; columnIndex++) {
                System.out.print("  ");
            }

            System.out.println("*");
        }


        for (int columnIndex = 0; columnIndex < size; columnIndex++) {
            System.out.print("* ");
        }

        System.out.println();



    }
}
