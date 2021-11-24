package algorithmstransformation.letters;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TwoLettersTest {

    TwoLetters twoLetters = new TwoLetters();

    @Test
    void testGetFirstTwoLetters() {
        List<String> source = Arrays.asList("ezért", "azért", "miért", "hozé");
        List<String> expected = Arrays.asList("ez", "az", "mi", "ho");
        List<String> actual = twoLetters.getFirstTwoLetters(source);

        assertEquals(expected.toString(),actual.toString());
        assertEquals(expected,actual);

    }
}