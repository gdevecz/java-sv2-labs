package algorithmsdecision.words;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WordsTest {

    Words word = new Words();
    List<String> source;
    String pattern;

    @BeforeEach
    void init() {
        source = Arrays.asList(
                "shortest",
                "just shorter",
                "longer than short",
                "this is the longest"
        );
        pattern = "this is pattern";
    }

    @Test
    void testContainsFewerHabitantsWordsNullException() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> word.containsLongerWord(null, pattern));

        assertEquals("The list is null!", exception.getMessage());
    }

    @Test
    void testContainsFewerHabitantsPatternNullException() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> word.containsLongerWord(source, null));

        assertEquals("The string is null!", exception.getMessage());
    }
}