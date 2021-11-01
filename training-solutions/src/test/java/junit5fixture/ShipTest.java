package junit5fixture;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShipTest {
    Ship ship;

    @BeforeEach
    void init(){
        ship = new Ship("Felhő Nélküli Turbulencia", 3210,50.123);
    }

    @Test
    void testName() {
        assertEquals("Felhő Nélküli Turbulencia", ship.getName());
        assertNotEquals("Felhő Turbulencia", ship.getName());
    }

    @Test
    void testYearOfConstruction() {
        assertEquals(3210, ship.getYearOfConstruct());
        assertTrue(3210 == ship.getYearOfConstruct());
        assertFalse(300 == ship.getYearOfConstruct());
    }

    @Test
    void testLength() {
        assertEquals(50.12, ship.getLength(), 0.005);
    }

    @Test
    void testNull() {
        Ship anotherShip = null;
        assertNull(anotherShip);
        assertNotNull(ship);
    }

    @Test
    void testSameObjects() {
        Ship anotherShip = ship;
        assertSame(anotherShip,ship);
    }

    @Test
    void testNotSameObjects() {
        Ship anotherShip = new Ship("Felhő Nélküli Turbulencia", 3210,50.123);
        assertNotSame(anotherShip, ship);
    }
}