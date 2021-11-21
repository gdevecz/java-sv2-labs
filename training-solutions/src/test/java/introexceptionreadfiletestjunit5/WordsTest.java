package introexceptionreadfiletestjunit5;


import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class WordsTest {

    Words words = new Words();

    @Test
    void testGetFirstWordWithA() {
        Path path = Paths.get("src/test/resources/introexceptionreadfiletestjunit4/words.txt");
        String result = words.getFirstWordWithA(path);
        assertEquals("Anna", result);

    }

    @Test
    void testGetFirstWordWithoutFounded() {
        Path path = Paths.get("src/test/resources/introexceptionreadfiletestjunit4/wordswithmissing.txt");
        String result = words.getFirstWordWithA(path);
        assertEquals("A", result);
    }

    @Test
    void testGetFirstWordWithAMissingFile() {
        IllegalStateException exception = assertThrows(IllegalStateException.class,
                () -> words.getFirstWordWithA(Paths.get("wrong")));
        assertEquals("Can not read file!", exception.getMessage());
    }

}