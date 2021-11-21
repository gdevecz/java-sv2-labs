package introexceptionreadfiletestjunit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class WordsTest {

    Words words = new Words();

    @Test
    public void testGetFirstWordWithA() {
        Path path = Paths.get("src/test/resources/introexceptionreadfiletestjunit4/words.txt");
        String result = words.getFirstWordWithA(path);
        assertEquals("Anna", result);

    }

    @Test
    public void testGetFirstWordWithoutFounded() {
        Path path = Paths.get("src/test/resources/introexceptionreadfiletestjunit4/wordswithmissing.txt");
        String result = words.getFirstWordWithA(path);
        assertEquals("A", result);
    }

    @Test(expected = IllegalStateException.class)
    public void testGetFirstWordWithAMissingFileOne() {
        words.getFirstWordWithA(Paths.get("wrong"));
    }

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void testGetFirstWordWithAMissingFileTwo() {
        exception.expect(IllegalStateException.class);
        exception.expectMessage("Can not read file!");
        words.getFirstWordWithA(Paths.get("Wrong"));
    }

    @Test
    public void testGetFirstWordWithAMissingFileThree() {
        IllegalStateException exception = assertThrows(IllegalStateException.class,
                () -> words.getFirstWordWithA(Paths.get("wrong")));
        assertEquals("Can not read file!", exception.getMessage());
    }
}