package lecture03.task03;

import java.util.Scanner;

public class InchesToCentimeters {

    public static void main(String[] args) {


        System.out.println("Enter inches to convert in centimeters :");

        Scanner scanner = new Scanner(System.in);

        double inch = 0;

        inch = scanner.nextDouble();
        System.out.println("Inche to centimeters :" + inch*2.54);


    }
}
