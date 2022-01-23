package sorting;

public class Car {

    private String brand;

    private int yearOfProduct;

    private int price;

    public Car(String brand, int yearOfProduct, int price) {
        this.brand = brand;
        this.yearOfProduct = yearOfProduct;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public int getYearOfProduct() {
        return yearOfProduct;
    }

    public int getPrice() {
        return price;
    }
}
