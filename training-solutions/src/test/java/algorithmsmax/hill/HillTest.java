package algorithmsmax.hill;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HillTest {

    @Test
    void testGetMax() {
        Hill hill = new Hill();
        List<Integer> source = Arrays.asList(1000, 798, 812, 1820, 1450);

        assertEquals(1820, hill.getMax(source));
    }
}