package interfacedefaultmethods.longword;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongWordTest {

    @Test
    void getLongWordTest() {
        LongWord longWord = new LongWord();

        assertEquals("LONGWORD",longWord.getLongWord());
    }
}