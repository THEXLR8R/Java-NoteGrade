package lecture05.task05;

import java.util.Scanner;

public class Print2dArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int counter = 1;

        for (int row = 0; row < n; row++) {

            for (int col = 0; col < n; col++) {

                System.out.printf("%4d ", counter);
                counter++;

            }

            System.out.println();
        }
        System.out.println("Done!!!");
    }
}
