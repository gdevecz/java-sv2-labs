package methodparam.sums;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class SeparatedSumTest {

    @Test
    void sumTest() {
        SeparatedSum sSum= new SeparatedSum();
        Path path = Path.of("src/test/resources/methodparam/sums/floatingnumbers.txt");
        SumsOfPositivesAndNegatives actual = sSum.sum(path);

        assertEquals(110.6, actual.getSumOfPositives(),0.0001);
        assertEquals(-153.3, actual.getSumOfNegatives(), 0.0001);

    }
}