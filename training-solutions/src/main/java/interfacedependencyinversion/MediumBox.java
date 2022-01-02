package interfacedependencyinversion;

public class MediumBox implements Box{

    private static final Size SIZE = Size.M;

    private static final int PRICE = 2000;

    @Override
    public Size getSize() {
        return SIZE;
    }

    @Override
    public int getPrice() {
        return PRICE;
    }
}
