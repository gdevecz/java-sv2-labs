package interfaces.animal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ZooTest {

    Zoo zoo;

    @BeforeEach
    void init() {
        Duck duck = new Duck();
        Lion lion = new Lion();
        Worm worm = new Worm();

        zoo = new Zoo(Arrays.asList(duck, lion, worm));
    }

    @Test
    void getAnimalsTest() {
        assertEquals(3, zoo.getAnimals().size());
        assertEquals("Lion", zoo.getAnimals().get(2).getName());
    }

    @Test
    void getNumberOfAnimalsTest() {
        assertEquals(3, zoo.getNumberOfAnimals());
    }

    @Test
    void getNumberOfAllLegsTest() {
        assertEquals(6, zoo.getNumberOfAllLegs());
    }
}