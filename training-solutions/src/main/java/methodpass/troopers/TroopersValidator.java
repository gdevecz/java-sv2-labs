package methodpass.troopers;

public class TroopersValidator {

    public boolean isTargetValid(Position target) {
        if (target == null) {
            return false;
        }
        return true;
    }

    public boolean isTrooperValid(Trooper trooper) {
        if (trooper == null) {
            return false;
        }
        return true;
    }

    public boolean isNameValid(String text) {
        if (text == null) {
            return false;
        }
        if (text.isBlank()) {
            return false;
        }
        return true;
    }

    public boolean isPositionValid(Position position) {
        if (position == null) {
            return false;
        }
        return true;
    }
}
