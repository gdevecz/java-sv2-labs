package finalmodifier;

public class TaxCalculator {

    public final double PERCENT_OF_TAX = 0.27;

    public double tax(double price) {
        return price * PERCENT_OF_TAX;
    }

    public double priceWithTax(double price) {
        return price + tax(price);
    }
}
