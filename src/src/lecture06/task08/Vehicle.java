package lecture06.task08;

import java.time.Year;

public class Vehicle {

    static short currentYear = (short) Year.now().getValue();

    String type;
    String model;
    short power;
    float fuelConsumptionPer100km;
    float weight;
    short year;
    String color;
    String licenseNo;

    Vehicle(String licenseNo, String type, String model, short power, float fuelConsumptionPer100km, short year, float weight, String color) {
        this.licenseNo = licenseNo;
        this.type = type;
        this.model = model;
        this.power = power;
        this.fuelConsumptionPer100km = fuelConsumptionPer100km;
        this.year = year;
        this.weight = weight;
        this.color = color;
    }

    Vehicle(String licenseNo, String type, String model, short power, float fuelConsumptionPer100km, short year) {
        this(licenseNo, type, model, power, fuelConsumptionPer100km, year, -1, "N/A");
    }

    double calculateTripPrice(double fuelPrice, double distance) {
        return distance * (fuelConsumptionPer100km / 100) * fuelPrice;
    }

    double getInsurancePrice() {

        double insurancePrice = 0.01 * power * (currentYear - year) * fuelConsumptionPer100km;

        switch (type) {
            case "car":
                insurancePrice *= 1;
                break;
            case "suv":
                insurancePrice *= 1.12;
                break;
            case "truck":
                insurancePrice *= 1.2;
                break;
            case "motorcycle":
                insurancePrice *= 1.5;
                break;
            default:
                // should never happen
                insurancePrice = -1;
                break;
        }

        return insurancePrice;
    }

    @Override
    public String toString() {

        String result = String.format("%s - %s, %s", this.licenseNo, this.model, this.year);

        if (this.color != null) {
            result += String.format(", %s", this.color);
        }

        return result;
    }


}
