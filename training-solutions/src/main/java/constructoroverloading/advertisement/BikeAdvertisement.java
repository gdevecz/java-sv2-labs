package constructoroverloading.advertisement;

import java.util.ArrayList;
import java.util.List;

public class BikeAdvertisement {

    private String shortDescription;

    private int price;

    private List<String> extras = new ArrayList<>();

    private String brand;

    private String serial;

    public BikeAdvertisement(String shortDescription, int price) {
        this.shortDescription = shortDescription;
        this.price = price;
    }

    public BikeAdvertisement(String shortDescription, int price, String brand) {
        this(shortDescription, price);
        this.brand = brand;
    }

    public BikeAdvertisement(String shortDescription, int price, String brand, List<String> extras) {
        this(shortDescription, price, brand);
        this.extras = extras;
    }

    public BikeAdvertisement(String shortDescription, int price, String brand, List<String> extras, String serial) {
        this(shortDescription, price, brand, extras);
        this.serial = serial;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public int getPrice() {
        return price;
    }

    public List<String> getExtras() {
        return extras;
    }

    public String getBrand() {
        return brand;
    }

    public String getSerial() {
        return serial;
    }
}
