package interfaces.animal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DuckTest {

    Duck duck = new Duck();

    @Test
    void getNumberOfLegsTest() {
        assertEquals(2, duck.getNumberOfLegs());

    }

    @Test
    void getNameTest() {
        assertEquals("Duck", duck.getName());
    }
}