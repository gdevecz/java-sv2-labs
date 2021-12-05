package inheritancemethods.cars;

public class Car {

    private double fuelRate;

    private double fuel;

    private double tankCapacity;

    public Car(double fuelRate, double fuel, double tankCapacity) {
        if (fuel>tankCapacity) {
            throw new IllegalArgumentException("Tank capacity is less than fuel!");
        }
        this.fuelRate = fuelRate;
        this.fuel = fuel;
        this.tankCapacity = tankCapacity;
    }

    public void modifyFuelAmount(double fuel) {
        this.fuel += fuel;
    }

    public void drive(int km) {
        double neededFuel = getNeededFuel(km);
        if (fuel - neededFuel > 0.0) {
            fuel -= neededFuel;
        } else {
            throw new IllegalArgumentException("Not enough fuel available!");
        }
    }

    public double calculateRefillAmount() {
        return tankCapacity - fuel;
    }

    protected double getNeededFuel(int km) {
        return km * fuelRate / 100;
    }

    public double getFuelRate() {
        return fuelRate;
    }

    public double getFuel() {
        return fuel;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }
}
