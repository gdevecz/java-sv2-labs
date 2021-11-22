package algorithmsmax.temperature;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureTest {

    @Test
    void testGetMin() {
        Temperature temperature = new Temperature();
        List<Integer> source = Arrays.asList(27, 23, 25, 26, 21, 24);

        assertEquals(21, temperature.getMin(source));
    }
}