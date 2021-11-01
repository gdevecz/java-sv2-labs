package junit5assert;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumbersTest {

    @Test
    void testGetEvenNumbers() {
        Numbers numbers = new Numbers();
//        int[] source = {1, 13, 2, 4, 12, 45, 32, 4, 263, 1};
//        int[] target = {0, 0, 2, 4, 12, 0, 32, 4, 0, 0};
        int[] source = {2, 8, 5, 6, 2, 3, 9};
        int[] target = {2, 8, 0, 6, 2, 0, 0};

        assertArrayEquals(numbers.getEvenNumbers(source),target);
    }
}