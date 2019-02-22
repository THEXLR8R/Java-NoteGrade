package lecture03.task10;

import java.util.Scanner;

/* Classical play cards use the following
signs to designate the card face
2,3,4,5,6,7,8,9,10, J, Q, K and A
write a program that enters a string and prints
"yes Content_of_string" if it is a valid card or
"no Content_of_string" otherwise
*/
public class PlayCards {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the card");

        String cardString = input.nextLine();

        //version1

//        if (cardString.equals("2")
//        || cardString.equals("3")
//        || cardString.equals("4")
//        || cardString.equals("5")
//        || cardString.equals("6")
//        || cardString.equals("7")
//        || cardString.equals("8")
//        || cardString.equals("9")
//        || cardString.equals("10")
//        || cardString.equals("J")
//        || cardString.equals("Q")
//        || cardString.equals("K")
//        || cardString.equals("A")) {
//            System.out.println("yes " + cardString);
//        }else {
//            System.out.println("no " + cardString);
//        }

        //version2
        switch (cardString) {
            case "2":
            case "3":
            case "4":
            case "5":
            case "6":
            case "7":
            case "8":
            case "9":
            case "10":
            case "J":
            case "Q":
            case "K":
            case "A":
                System.out.println("yes " + cardString);
                break;
            default:
                System.out.println("no " + cardString);
                break;
        }

    }

}
