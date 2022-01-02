package interfaces.animal;

public class Lion implements Animal{

    private static final int numberOfLegs = 4;

    private static final String name = "Lion";

    @Override
    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    @Override
    public String getName() {
        return name;
    }
}
