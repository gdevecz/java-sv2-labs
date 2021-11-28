package methodpass.troopers;

public class Position {

    private final double posX;

    private final double posY;

    private TroopersValidator validator = new TroopersValidator();

    public Position(double posX, double posY) {
        this.posX = posX;
        this.posY = posY;
    }

    public double distanceFrom(Position position) {
        if (!validator.isPositionValid(position)) {
            throw new IllegalArgumentException("The position is null.");
        }
        return Math.sqrt(
                Math.pow(posX - position.posX, 2)
                        + Math.pow(posY - position.posY, 2)
        );
    }

    public double getPosX() {
        return posX;
    }

    public double getPosY() {
        return posY;
    }
}
