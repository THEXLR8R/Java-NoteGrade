package lecture00.task01;

import java.util.Scanner;

public class Fibbonachi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        int num1 = 0;
        int num2 = 1;

        System.out.println("Upto " + number + ":");

        for (int i = 1; i <= number; ++i) {
            System.out.print(num1 + " + ");

            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        }
    }
}

