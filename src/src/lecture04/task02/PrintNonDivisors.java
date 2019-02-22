package lecture04.task02;

import java.util.Scanner;

public class PrintNonDivisors {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy7 = i % 7 == 0;

            if (!divisibleBy3 && !divisibleBy7) {
                System.out.print(i + " ");
            }
        }



    }
}
