package methodpass.troopers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrooperTest {

    Trooper trooper = new Trooper("John Doe");

    @Test
    void testCreate() {
        Trooper trooper = new Trooper("John Doe");

        assertEquals("John Doe", trooper.getName());
        assertEquals(0, trooper.getPosition().getPosX());
        assertEquals(0, trooper.getPosition().getPosY());
    }

    @Test
    void testCreateFail() {
        IllegalArgumentException exceptionNull = assertThrows(IllegalArgumentException.class,
                () -> new Trooper(null));
        IllegalArgumentException exceptionBlank = assertThrows(IllegalArgumentException.class,
                () -> new Trooper("  "));

        assertEquals("The name is null or blank.", exceptionNull.getMessage());
        assertEquals("The name is null or blank.", exceptionBlank.getMessage());
    }

    @Test
    void testChangePosition() {
        trooper.changePosition(new Position(5.1, 3.2));
        assertEquals(5.1, trooper.getPosition().getPosX());
        assertEquals(3.2, trooper.getPosition().getPosY());

    }

    @Test
    void testChangePositionFail() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> trooper.changePosition(null));

        assertEquals("The target is null.", exception.getMessage());
    }

    @Test
    void testDistanceFrom() {
        trooper.changePosition(new Position(1.4, 1.2));
        Position position = new Position(4.4, 5.2);

        assertEquals(5.0, trooper.distanceFrom(position));
    }

    @Test
    void testDistanceFromFail() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> trooper.distanceFrom(null));

        assertEquals("The target is null.", exception.getMessage());
    }
}