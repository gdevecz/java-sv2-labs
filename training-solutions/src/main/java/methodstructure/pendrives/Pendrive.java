package methodstructure.pendrives;

public class Pendrive {

    private String name;

    private int capacity;

    private int price;

    public Pendrive(String name, int capacity, int price) {
        this.name = name;
        this.capacity = capacity;
        this.price = price;
    }

    public void risePrice(int percent) {
        price = (int) Math.round(price * (1.0 + percent / 100.0));
    }

    public int comparePricePerCapacity(Pendrive other) {
        double thisPriceOfOneGB = priceOfOneGB(price, capacity);
        double otherPriceOfOneGB = priceOfOneGB(other.getPrice(), other.getCapacity());
        if (thisPriceOfOneGB > otherPriceOfOneGB) {
            return 1;
        }
        if (thisPriceOfOneGB < otherPriceOfOneGB) {
            return -1;
        }
        return 0;
    }

    public boolean isCheaperThan(Pendrive other) {
        return price < other.getPrice();
    }

    @Override
    public String toString() {
        return name + ", capacity: " + capacity + ", ár: " + price;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getPrice() {
        return price;
    }

    private double priceOfOneGB(int price, int capacity) {
        return (double) price / (double) capacity;
    }
}
