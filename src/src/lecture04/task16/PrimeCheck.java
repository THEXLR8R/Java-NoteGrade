package lecture04.task16;

import java.util.Scanner;

public class PrimeCheck {

    public static void main(String[] args) {

        boolean isPrime;

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number here :");
        //user input
        int input = sc.nextInt();

        isPrime = true;
        for(int i = 2; i < input / 2; i++) {
            if (input % i == 0 ) {
                isPrime = true;
            }
            isPrime = false;
        }
        if(isPrime) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }



    }

}
