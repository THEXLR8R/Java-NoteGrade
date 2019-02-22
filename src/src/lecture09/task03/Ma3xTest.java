package lecture09.task03;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ma3xTest {

    @Test
    void regular_customer_has_no_discount() {
        // GIVEN
        Ma3x ma3x = new Ma3x(2);
        Customer customer = new RegularCustomer();

        // WHEN
        double price = ma3x.charge(customer, 2);

        //THEN
        Assertions.assertEquals(4, price);
    }

    @Test
    void silver_customer_has_10_percent_discount() {
        // GIVEN
        Ma3x ma3x = new Ma3x(2);
        Customer customer = new SilverCustomer();

        // WHEN
        double price = ma3x.charge(customer, 2);

        //THEN
        Assertions.assertEquals(3.6, price);
    }

    @Test
    void gold_customer_has_25_percent_discount() {
        // GIVEN
        Ma3x ma3x = new Ma3x(2);
        Customer customer = new GoldCustomer();

        // WHEN
        double price = ma3x.charge(customer, 2);

        //THEN
        Assertions.assertEquals(3, price);
    }

    @Test
    void platinum_customer_has_40_percent_discount() {
        // GIVEN
        Ma3x ma3x = new Ma3x(2);
        Customer customer = new PlatinumCustomer();

        // WHEN
        double price = ma3x.charge(customer, 2);

        //THEN
        Assertions.assertEquals(2.4, price);
    }

}
