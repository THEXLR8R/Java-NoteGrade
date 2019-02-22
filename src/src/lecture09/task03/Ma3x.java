package lecture09.task03;

public class Ma3x {

    private double pricePerHour;

    public Ma3x(double pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    double charge(Customer customer, int hours) {
        double sum = pricePerHour * hours;
        return customer.applyDiscount(sum);
    }

}
