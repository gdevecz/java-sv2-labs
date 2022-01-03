package interfacedefaultmethods.seats;

public class Car implements Seat {

    private String brand;

    private int numberOfSeats;

    public Car(String band, int numberOfSeats) {
        this.brand = band;
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public String getBrand() {
        return brand;
    }
}
