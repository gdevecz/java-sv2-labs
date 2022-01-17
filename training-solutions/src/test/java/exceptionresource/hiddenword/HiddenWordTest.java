package exceptionresource.hiddenword;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class HiddenWordTest {

    HiddenWord hiddenWord = new HiddenWord();

    @Test
    void getHiddenWordTest() {
        Path path = Path.of("src/test/resources/hiddenword.txt");

        assertEquals("ALMA KÖRTE", hiddenWord.getHiddenWord(path));
    }

    @Test
    void getHiddenWordFailedFileReadTest() {
        Path path = Path.of("src/test/resources/wrong.txt");

        IllegalStateException exception = assertThrows(IllegalStateException.class,
                () -> hiddenWord.getHiddenWord(path));

        assertEquals("File can not read.", exception.getMessage());
    }
}