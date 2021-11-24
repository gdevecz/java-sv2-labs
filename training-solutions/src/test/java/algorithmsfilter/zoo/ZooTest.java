package algorithmsfilter.zoo;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ZooTest {

    Zoo zoo;

    @Test
    void testGetAnimalsWithNumberOfLegsGiven() {
        Animal fourLeggedOne = new Animal("kutya", 4);
        Animal fourLeggedTwo = new Animal("kutya", 4);
        Animal twoLegged = new Animal("majom", 2);
        zoo = new Zoo(Arrays.asList(fourLeggedOne, twoLegged, fourLeggedTwo));

        List<Animal> actual = (zoo.getAnimalsWithNumberOfLegsGiven(4));

        assertEquals(2, actual.size());
        assertEquals(true, actual.contains(fourLeggedTwo));
        assertEquals(false, actual.contains(twoLegged));
    }
}