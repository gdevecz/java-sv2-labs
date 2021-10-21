package statements;

public class Investment {

    private final double cost = 0.3;

    private int fund;

    private int interestRate;

    private boolean active;

    public Investment(int fund, int interestRate) {
        this.fund = fund;
        this.interestRate = interestRate;
        active = true;
    }

    public int getFund() {
        return fund;
    }

    public double getYield(int days) {
        double payBack = active ? fund + fund * 0.08 * days / 365 : 0.0;
        return payBack;
    }

    public double close(int days){
        double payBack = getYield(days);
        payBack -= payBack * 0.003;
        active = false;
        return payBack;
    }
}
