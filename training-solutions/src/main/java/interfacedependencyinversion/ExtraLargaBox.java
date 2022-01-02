package interfacedependencyinversion;

public class ExtraLargaBox implements Box{

    private static final Size SIZE = Size.XL;

    private static final int PRICE = 5000;

    @Override
    public Size getSize() {
        return SIZE;
    }

    @Override
    public int getPrice() {
        return PRICE;
    }
}
