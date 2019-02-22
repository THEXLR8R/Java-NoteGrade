package lecture06.task08;

import java.util.Scanner;

public class VehicleMonitor {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        double fuelPrice = scanner.nextDouble();
        int distance = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {

            Vehicle vehicle = readVehicle(scanner, i);

            double tripPrice = vehicle.calculateTripPrice(fuelPrice, distance);
            double insurancePrice = vehicle.getInsurancePrice();

            System.out.println(vehicle);
            System.out.printf("Insurance cost: %.2f - Travel cost: %.2f%n%n", insurancePrice, tripPrice);
        }
    }

    private static Vehicle readVehicle(Scanner scanner, int index) {

        String line = scanner.nextLine();
        String[] split = line.split(",");

        String type = split[0].trim();
        String model = split[1].trim();
        short power = Short.parseShort(split[2].trim());
        float fuelConsumption = Float.parseFloat(split[3].trim());
        short year = Short.parseShort(split[4].trim());

        String licenseNo = String.format("%04d", index);

        if (split.length == 7) {
            float weight = Float.parseFloat(split[5].trim());
            String color = split[6].trim();

            return new Vehicle(licenseNo, type, model, power, fuelConsumption, year, weight, color);
        }

        return new Vehicle(licenseNo, type, model, power, fuelConsumption, year);
    }

}
