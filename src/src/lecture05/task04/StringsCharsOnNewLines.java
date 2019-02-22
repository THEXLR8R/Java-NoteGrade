package lecture05.task04;

import java.util.Scanner;

public class StringsCharsOnNewLines {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the word here :");
        String input = scanner.nextLine();

        for (char c : input.toCharArray()) {
            System.out.println(c);
        }
        System.out.println("Done!");

    }

}
