package lecture03.task06.a;

import java.util.Scanner;

public class SwapVariables {

    public static void main(String[] args) {

        int a, b ;
        int tmp;
        Scanner scanner = new Scanner(System.in);


        System.out.println("Please enter an integer numbers : ");
        a = scanner.nextInt();
        b = scanner.nextInt();

        tmp = a;
        a = b;
        b = tmp;

        System.out.println("Variables are now : " + a + " " + b);



    }
}
