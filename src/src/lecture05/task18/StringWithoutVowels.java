package lecture05.task18;

import java.util.Scanner;

public class StringWithoutVowels {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text here (only string) :");
        String input = sc.nextLine();
        System.out.println("Removing all Vowels : " + input);
        String inputNew = input.replaceAll("[aeiouAEIOU]", "");
        System.out.println(inputNew);
        System.out.println("All vowels were removed succesfully");



    }

}
