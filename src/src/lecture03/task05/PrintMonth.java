package lecture03.task05;

import java.util.Scanner;

public class PrintMonth {

    public static void main(String[] args) {

        String error_Message = "You put a number above or below month number";
        int d;

        System.out.println("Enter month number :");
        Scanner scanner = new Scanner(System.in);

        d = scanner.nextInt();

        if (d > 0)  {
        } else if (d < 12){
            System.out.println("The month is :" +d );
        }
        switch (d) {

            case 1:
                System.out.println("The month is January");
                break;
            case 2:
                System.out.println("The month is February");
                break;
            case 3:
                System.out.println("The month is March");
                break;
            case 4:
                System.out.println("The month is April");
                break;
            case 5:
                System.out.println("The month is May");
                break;
            case 6:
                System.out.println("The month is June");
                break;
            case 7:
                System.out.println("The month is July");
                break;
            case 8:
                System.out.println("The month is August");
                break;
            case 9:
                System.out.println("The month is September");
                break;
            case 10:
                System.out.println("The month is October");
                break;
            case 11:
                System.out.println("The month is November");
                break;
            case 12:
                System.out.println("The month is December");
                break;
            default:
                //	System.out.println("You put wrong number for the month!");            // version 1
                System.out.println(error_Message);                                    // version 2
        }
    }
}
