package lecture04.task10;

import java.util.Scanner;

public class PrintSumOfDigits {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int sum = 0;

        while (n != 0) {

            int lastDigit = n % 10;
            sum += lastDigit;

            n /= 10;
        }

        System.out.println(sum);



    }

}
