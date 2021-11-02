package controlselection.consonant;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ToConsonantTest {
    ToConsonant toConsonant = new ToConsonant();

    @Test
    void name() {
        char[] source = {'a', 'b', 'd', 'e', 'f', 'h', 'i', 'j', 'n', 'o', 'p', 't', 'u', 'v'};
        char[] target = {'b', 'b', 'd', 'f', 'f', 'h', 'j', 'j', 'n', 'p', 'p', 't', 'v', 'v'};

        for (int i = 0; i < source.length;i++) {
            assertEquals(target[i],toConsonant.notASinglevowel(source[i]));
        }
    }
}