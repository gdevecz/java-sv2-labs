package interfacedependencyinversion;

public class LargeBox implements Box{

    private static final Size SIZE = Size.L;

    private static final int PRICE = 3000;

    @Override
    public Size getSize() {
        return SIZE;
    }

    @Override
    public int getPrice() {
        return PRICE;
    }
}
