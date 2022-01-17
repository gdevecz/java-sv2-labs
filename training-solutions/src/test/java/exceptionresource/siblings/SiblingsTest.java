package exceptionresource.siblings;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SiblingsTest {

    @Test
    void getFullNamesTest() {

        List<String> expected = Arrays.asList("Szabó Emese", "Szabó Ferenc");
        Path path = Path.of("src/test/resources/siblings.txt");

        assertEquals(expected, new Siblings().getFullNames("Szabó", path));
    }

    @Test
    void getFullNamesWrongFileNameTest() {
        Path path = Path.of("src/test/resources/wrong.txt");

        IllegalStateException exception = assertThrows(IllegalStateException.class,
                () -> new Siblings().getFullNames("e", path));

        assertEquals("File can not read.", exception.getMessage());
    }
}