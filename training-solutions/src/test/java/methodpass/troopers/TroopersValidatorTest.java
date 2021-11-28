package methodpass.troopers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TroopersValidatorTest {

    TroopersValidator validator = new TroopersValidator();

    @Test
    void isTargetValid() {

        assertEquals(true, validator.isTargetValid(new Position(3.3, 2.1)));
        assertEquals(false, validator.isTargetValid(null));
    }

    @Test
    void isTrooperValid() {

        assertEquals(true, validator.isTrooperValid(new Trooper("John Doe")));
        assertEquals(false, validator.isTrooperValid(null));
    }

    @Test
    void isNameValid() {

        assertEquals(true, validator.isNameValid("John Doe"));
        assertEquals(false, validator.isNameValid(null));
        assertEquals(false, validator.isNameValid("    "));
    }

    @Test
    void isPositionValid() {
        assertEquals(true, validator.isPositionValid(new Position(3.3, 2.1)));
        assertEquals(false, validator.isPositionValid(null));

    }
}