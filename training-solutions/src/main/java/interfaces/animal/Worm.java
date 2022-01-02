package interfaces.animal;

public class Worm implements Animal{

    private static final int numberOfLegs = 0;

    private static final String name = "Worm";

    @Override
    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    @Override
    public String getName() {
        return name;
    }
}
