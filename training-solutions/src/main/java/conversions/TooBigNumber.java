package conversions;

public class TooBigNumber {

    public long getRightResult(int number) {
        return Integer.MAX_VALUE + (long)number;
    }
}
