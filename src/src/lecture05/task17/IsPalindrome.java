package lecture05.task17;

import java.util.Scanner;

public class IsPalindrome {

    public static void main(String[] args) {

        String reverse = "";

        System.out.println("Please enter the text :");
        Scanner sc = new Scanner(System.in);
        String original = sc.nextLine();

        for (int i = original.length()-1; i >= 0 ; i--) {
            reverse = reverse + original.charAt(i);
        }

        if (original.equals(reverse)) {
            System.out.println("true");
        } else {
            System.out.println("flase");
        }

    }

}
