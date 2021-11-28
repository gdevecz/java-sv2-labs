package methodpass.troopers;

public class Trooper {

    private String name;

    private Position position = new Position(0, 0);

    private TroopersValidator validator = new TroopersValidator();

    public Trooper(String name) {
        if (!validator.isNameValid(name)) {
            throw new IllegalArgumentException("The name is null or blank.");
        }
        this.name = name;
    }

    public void changePosition(Position target) {
        if (!validator.isPositionValid(target)) {
            throw new IllegalArgumentException("The target is null.");
        }
        position = target;
    }

    public double distanceFrom(Position target) {
        if (!validator.isPositionValid(target)) {
            throw new IllegalArgumentException("The target is null.");
        }
        return position.distanceFrom(target);
    }

    public String getName() {
        return name;
    }

    public Position getPosition() {
        return new Position(position.getPosX(), position.getPosY());
    }
}
