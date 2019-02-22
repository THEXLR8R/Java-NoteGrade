package lecture11.task00.insurance;

import java.time.YearMonth;

public class SocialInsuranceRecord {

    private final double amount;
    private final YearMonth yearMonth;

    public SocialInsuranceRecord(double amount, YearMonth yearMonth) {
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
