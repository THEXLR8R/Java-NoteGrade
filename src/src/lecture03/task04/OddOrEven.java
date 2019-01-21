package lecture03.task04;

import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {

        int x;

        System.out.println("Please enter your number : ");
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();

        //mathematical calculation
        if (x % 2 == 0) {
            System.out.println("Your number is even " + " " + x);


        } else {
            System.out.println("Your number is odd" + " " + x);
        }




    }
}
