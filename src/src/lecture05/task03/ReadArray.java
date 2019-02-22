package lecture05.task03;

import java.util.Scanner;

public class ReadArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            System.out.print(arr[i] + ", ");
        }

        System.out.println(arr[n - 1]);

    }

}
