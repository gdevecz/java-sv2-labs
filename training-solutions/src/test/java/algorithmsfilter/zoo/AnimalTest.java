package algorithmsfilter.zoo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    @Test
    void testCreate() {
        Animal animal = new Animal("állat neve", 4);

        assertEquals("állat neve", animal.getName());
        assertEquals(4, animal.getNumberOfLegs());
    }
}