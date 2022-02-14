package lambdacomparator.cloud;

public class CloudStorage implements Comparable<CloudStorage> {

    private static final int STANDARD_SIZE = 1000;

    private static final int STANDARD_PERIOD = 12;

    private String provider;

    private int space;

    private PayPeriod period;

    private double price;

    public CloudStorage(String provider, int space, PayPeriod payPeriod, double price) {
        this(provider, space);
        this.period = payPeriod;
        this.price = price;
    }

    public CloudStorage(String provider, int space) {
        this.provider = provider;
        this.space = space;
    }

    @Override
    public int compareTo(CloudStorage o) {
        double currentValue = priceForThousandGBForYear(this);
        double otherValue = priceForThousandGBForYear(o);
        return Double.compare(currentValue, otherValue);
    }

    public String getProvider() {
        return provider;
    }

    public int getSpace() {
        return space;
    }

    public PayPeriod getPeriod() {
        return period;
    }

    public double getPrice() {
        return price;
    }

    private double priceForThousandGBForYear(CloudStorage cloudStorage) {
           return cloudStorage.period != null ? cloudStorage.price * STANDARD_PERIOD / cloudStorage.period.getLength() / cloudStorage.space * STANDARD_SIZE : 0;
    }

}
