package junit5fixture;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WordsTest {

    Words words;

    @BeforeEach
    void init() {
        words = new Words();
        words.addWord("elsőszó");
        words.addWord("második szó");
        words.addWord("preHarmadikszó");
        words.addWord("negyedikszó");
        words.addWord("preötödikszó");
    }

    @Test
    void testGetWordsStartWith() {
        List<String> target = Arrays.asList("preHarmadikszó", "preötödikszó");
        words.getWordsStartWith("pre");
        assertArrayEquals(target.toArray(), words.getWords().toArray());
    }

    @Test
    void testGetWordsWithLength() {
        List<String> target = Arrays.asList("második szó", "negyedikszó");
        words.getWordsWithLength(11);
        assertArrayEquals(target.toArray(), words.getWords().toArray());
    }
}