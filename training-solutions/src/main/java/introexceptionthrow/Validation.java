package introexceptionthrow;

import java.util.InputMismatchException;

public class Validation {

    public void validateName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("The name is null or empty!");
        }
    }

    public void validateAge(String ageString) {
        if (ageString.isBlank()) {
            throw new IllegalArgumentException("The age is empty!");
        }
        if (!isNumber(ageString)) {
            throw new IllegalArgumentException("The input is not just number!");
        }
        int number = Integer.parseInt(ageString);
        if (number < 0 || number > 120) {
            throw new IllegalArgumentException("The age must be between 0 and 120");
        }
    }

    private boolean isNumber(String numberString) {
        int i = 0;
        while (i < numberString.length() && Character.isDigit(numberString.charAt(i++)))
            ;
        if (i != numberString.length()) {
            return false;
        }
        return true;
    }
}
