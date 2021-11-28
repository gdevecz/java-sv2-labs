package methodchain;

public class Grasshopper {

    private int position = 0;

    public void moveFromZeroToThreeWithFiveHops() {
        this.hopOnce(Direction.POSITIVE)
                .hopOnce(Direction.NEGATIVE)
                .hopOnce(Direction.POSITIVE)
                .hopOnce(Direction.POSITIVE)
                .hopOnce(Direction.POSITIVE);
    }

    public Grasshopper hopOnce(Direction direction) {
        if (direction == Direction.POSITIVE) {
            position++;
        } else {
            position--;
        }
        return this;
    }

    public int getPosition() {
        return position;
    }
}
