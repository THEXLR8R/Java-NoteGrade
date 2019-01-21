package lecture04.task14;

import java.util.Scanner;

public class PrintZFigure {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for size :");
        int size = sc.nextInt();

        for (int i = 0; i < size ; i++) {
            for (int j = 0; j < size ; j++) {
                if (i == 0 || i == size || j == size - 1)
                    System.out.print("* ");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }


    }
}
