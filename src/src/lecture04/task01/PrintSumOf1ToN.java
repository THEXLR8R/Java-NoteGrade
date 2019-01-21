package lecture04.task01;

import java.util.Scanner;

public class PrintSumOf1ToN {

    public static void main(String[] args) {

        int num = 1;
        int n;
        long sum = 0;
        System.out.println("Please enter an integer :");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        while (num <= n) {
            sum += num;
            num++;
        }

        System.out.println("Sum of number is :" + sum);


    }
}
