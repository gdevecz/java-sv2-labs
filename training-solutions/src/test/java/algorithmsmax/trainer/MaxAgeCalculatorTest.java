package algorithmsmax.trainer;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MaxAgeCalculatorTest {

    @Test
    void testGetTrainerWithMaxAge() {
        MaxAgeCalculator mac = new MaxAgeCalculator();
        List<Trainer> source =
                Arrays.asList(
                        new Trainer("John Doe", 33),
                        new Trainer("Jack Doe", 23),
                        new Trainer("Jill Doe", 43)
                );

        assertEquals(43,mac.getTrainerWithMaxAge(source).getAge());
    }
}