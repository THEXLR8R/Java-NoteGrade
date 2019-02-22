package lecture04.task05;

import java.util.Scanner;

public class PrintSumOfN {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the numbers : ");

        int numCounter = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i < numCounter; i++) {
            int n = scanner.nextInt();
            sum += n;
        }

        System.out.println("The sum of number is : " + sum);


    }

}
