package recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumbersTest {

    @Test
    void testGetSum() {
        Numbers numbers = new Numbers();
        int[] source = {1,2,3,4,5,6,7,8,9,10};

        assertEquals(55,numbers.getSum(source));

    }
}