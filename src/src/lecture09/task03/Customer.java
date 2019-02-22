package lecture09.task03;

public abstract class Customer {
    private double discount;

    Customer(double discount) {
        this.discount = discount;
    }

    final double applyDiscount(double sum) {
        return sum * (1 - discount);
    }

}
