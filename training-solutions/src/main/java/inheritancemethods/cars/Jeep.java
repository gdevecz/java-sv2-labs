package inheritancemethods.cars;

public class Jeep extends Car {

    private double extraCapacity;

    private double extraFuel;

    public Jeep(double fuelRate, double fuel, double tankCapacity, double extraCapacity, double extraFuel) {
        super(fuelRate, fuel, tankCapacity);
        if (extraFuel > extraCapacity) {
            throw new IllegalArgumentException("Auxiliary capacity is less than extra fuel!");
        }
        this.extraCapacity = extraCapacity;
        this.extraFuel = extraFuel;
    }

    @Override
    public void modifyFuelAmount(double fuel) {
        double extraAmount = (fuel - getTankCapacity());
        if (extraAmount > 0.0) {
            super.modifyFuelAmount(getTankCapacity());
            extraFuel += extraAmount;
        } else {
            super.modifyFuelAmount(fuel);
        }
    }

    public void drive(int km) {
        double needFuel = getNeededFuel(km);
        if (needFuel > getFuel() + extraFuel) {
            throw new IllegalArgumentException("Not enough fuel available!");
        }
        double remain = extraFuel - needFuel;
        if (remain < 0.0) {
            extraFuel = 0.0;
            modifyFuelAmount(remain);
        } else {
            extraFuel-=remain;
        }

    }

    public double calculateRefillAmount() {
        return getTankCapacity() + extraCapacity - getFuel() - extraFuel;
    }

    public double getExtraCapacity() {
        return extraCapacity;
    }

    public double getExtraFuel() {
        return extraFuel;
    }
}
