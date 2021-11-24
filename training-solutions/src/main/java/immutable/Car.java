package immutable;

import java.time.LocalDate;

public class Car {

    private final String brand;

    private final String type;

    private final int yearOfProduct;

    public Car(String brand, String type, int yearOfProduct) {
        if (type == null || type.isBlank()) {
            throw new IllegalArgumentException("Type is null or empty.");
        } else if (yearOfProduct > LocalDate.now().getYear()) {
            throw new IllegalArgumentException("Year of product is invalid");
        } else {
            this.brand = brand;
            this.type = type;
            this.yearOfProduct = yearOfProduct;
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getType() {
        return type;
    }

    public int getYearOfProduct() {
        return yearOfProduct;
    }
}
