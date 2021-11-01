package junit5assert;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DragonTest {
    @Test
    void nameTest() {
        // Given
        Dragon dragon = new Dragon("Süsü", 1, 2.4);

        // When
        String name = dragon.getName();

        // Then
        assertEquals(dragon.getName(), name);
        assertNotEquals(dragon.getName(), "Süüsü");
    }

    @Test
    void numberOfHeads() {
        // Given
        Dragon dragon = new Dragon ("Süsü", 1, 2.4);

        // When
        int heads = dragon.getNumberOfHeads();

        // Then
        assertEquals(heads, 1);
        assertTrue(heads == 1);
        assertFalse(heads != 1);
    }

    @Test
    void testHeight() {
        assertEquals(new Dragon("Süsü", 1, 2.345).getHeight(), 2.33, 0.05);
    }

    @Test
    void testNull() {
        Dragon dragon = new Dragon("Süsü", 1, 2.345);
        Dragon anotherDragon = null;

        assertNull(anotherDragon);
        assertNotNull(dragon);
    }

    @Test
    void testSameObjects() {
        Dragon dragon = new Dragon("Süsü", 1, 2.345);
        Dragon anotherDragon = dragon;

        assertSame(dragon,anotherDragon);
    }

    @Test
    void testNotSameObjects() {
        Dragon dragon = new Dragon("Süsü", 1, 2.345);
        Dragon anotherDragon = new Dragon("Süsü", 1, 2.345);

        assertNotSame(dragon,anotherDragon);
    }
}