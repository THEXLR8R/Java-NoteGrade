package lecture05.task19;

import java.util.Scanner;

public class PrintLetterCount {

    public static void main(String[] args) {

        char ch;
        int i;
        int count;
        String str;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the text : ");
        str = sc.nextLine();

        for (ch = (char) 65; ch<=90; ch++) {
            count=0;
            for (i = 0; i<str.length(); i++) {
                if (ch == str.charAt(i) || (ch+32) == str.charAt(i)) {
                    count++;
                }
            }
            if (count>0) {
                System.out.println(ch +"(" + count + ")");
            }
        }

    }


}
