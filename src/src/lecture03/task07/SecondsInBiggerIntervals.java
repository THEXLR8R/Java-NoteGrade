package lecture03.task07;

import java.util.Scanner;

public class SecondsInBiggerIntervals {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the time : ");
        int n = input.nextInt();
        int D = n/86400;
        int H = (n%86400)/3600;
        int M = ((n%86400)%3600)/60;
        int S =(((n%86400)%3600)%60);
        System.out.println("-------------------");
        System.out.println( D + " Days " + H + " Hours " + M + " Minutes " + S + " Seconds ");
        System.out.println("-------------------");



    }
}
