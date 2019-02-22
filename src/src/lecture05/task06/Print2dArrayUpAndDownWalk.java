package lecture05.task06;

import java.util.Scanner;

public class Print2dArrayUpAndDownWalk {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] output = new int[n][n];

        int counter = 1;

        for (int column = 0; column < n; column++) {

            if (column % 2 == 0) {
                for (int row = 0; row < n; row++) {
                    output[row][column] = counter;
                    counter++;
                }
            } else {
                for (int row = n - 1; row >= 0; row--) {
                    output[row][column] = counter;
                    counter++;
                }
            }
        }

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                System.out.printf("%4d", output[row][col]);
            }
            System.out.println();
        }

    }
}
