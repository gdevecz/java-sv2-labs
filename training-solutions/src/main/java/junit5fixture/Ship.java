package junit5fixture;

public class Ship {

    private String name;

    private int yearOfConstruct;

    private double length;

    public Ship(String name, int yearOfConstruct, double length) {
        this.name = name;
        this.yearOfConstruct = yearOfConstruct;
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public int getYearOfConstruct() {
        return yearOfConstruct;
    }

    public double getLength() {
        return length;
    }
}
