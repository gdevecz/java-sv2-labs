package methodpass.troopers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PositionTest {

    @Test
    void testCreate() {
        Position position = new Position(3.3, 4.4);

        assertEquals(3.3, position.getPosX());
        assertEquals(4.4, position.getPosY());
    }

    @Test
    void testDistanceFrom() {
        Position position = new Position(4.2, 5.3);
        Position target = new Position(1.2, 1.3);

        assertEquals(5.0, position.distanceFrom(target));
    }
}