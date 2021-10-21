package linebreak;

public class Car {

    public static void main(String[] args) {

        Car car =new Car();

        System.out.println(car.getBrandAndTypeInSeparateLines("Opel", "Omega"));
    }

    public String getBrandAndTypeInSeparateLines(String brand, String type) {
        return brand + "\r\n" + type;
    }
}
