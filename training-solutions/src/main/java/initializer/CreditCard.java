package initializer;

import java.util.ArrayList;
import java.util.List;

public class CreditCard {

    private static final List<Rate> rates;

    private long balance;

    static {
        rates = new ArrayList<>();
        rates.add(new Rate(Currency.HUF, 1.0));
        rates.add(new Rate(Currency.EUR, 308.23));
        rates.add(new Rate(Currency.SFR, 289.24));
        rates.add(new Rate(Currency.GBP, 362.23));
        rates.add(new Rate(Currency.USD, 289.77));
    }

    public CreditCard(long balance, Currency currency) {
        this.balance = Math.round(balance / getConversionFactorOfCurrency(currency));
    }

    public CreditCard(long balance) {
        this.balance = balance;
    }

    public long getBalance() {
        return balance;
    }

    public boolean payment(long amount, Currency currency) {
        long value = Math.round(amount / getConversionFactorOfCurrency(currency));
        return payment(value);
    }

    public boolean payment(long amount) {
        if (balance < amount) {
            return false;
        }
        balance -= amount;
        return true;
    }

    private double getConversionFactorOfCurrency(Currency currency) {
        for (Rate rate : rates) {
            if (rate.getCurrency() == currency) {
                return rate.getConversionFactor();
            }
        }
        throw new IllegalArgumentException("This conversation factor is not exists: " + currency.name());
    }
}
