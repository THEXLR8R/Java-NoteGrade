package lecture13.task00.insurance;

import java.time.YearMonth;

public class SocialInsurance {
    private final double amount;
    private final YearMonth yearMonth;

    public SocialInsurance(double amount, YearMonth yearMonth) {
        this.amount = amount;
        this.yearMonth = yearMonth;
    }

    public double getAmount() {
        return amount;
    }

    public YearMonth getYearMonth() {
        return yearMonth;
    }

}
