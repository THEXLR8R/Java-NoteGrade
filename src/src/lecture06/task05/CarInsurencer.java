package lecture06.task05;

import java.util.Scanner;

public class CarInsurencer {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] split = input.split(" ");

        Car car = new Car();
        car.brand = split[0];
        car.model = split[1];
        car.yearProduced = Integer.parseInt(split[2]);
        car.horsePower = Integer.parseInt(split[3]);

        System.out.println(car.eligibleTax());

    }
}
