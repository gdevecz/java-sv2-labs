package interfacedependencyinversion;

public class SmallBox implements Box{

    private static final Size SIZE = Size.S;

    private static final int PRICE = 1000;

    @Override
    public Size getSize() {
        return SIZE;
    }

    @Override
    public int getPrice() {
        return PRICE;
    }
}
