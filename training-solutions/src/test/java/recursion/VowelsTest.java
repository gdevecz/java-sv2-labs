package recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VowelsTest {

    @Test
    void testGetNumberOfVowels() {
        Vowels vowels = new Vowels();
        assertEquals(4,vowels.getNumberOfVowels("argeufti"));
        assertEquals(4,vowels.getNumberOfVowels("aeui"));
        assertEquals(0,vowels.getNumberOfVowels("rgft"));
        assertEquals(0,vowels.getNumberOfVowels(""));

    }
}