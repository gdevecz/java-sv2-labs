package interfaces.animal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LionTest {

    Lion lion = new Lion();

    @Test
    void getNumberOfLegsTest() {
        assertEquals(4, lion.getNumberOfLegs());
    }

    @Test
    void getNameTest() {
        assertEquals("Lion", lion.getName());
    }
}