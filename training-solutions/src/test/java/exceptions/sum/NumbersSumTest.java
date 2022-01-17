package exceptions.sum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumbersSumTest {

    NumbersSum numbersSum = new NumbersSum();

    @Test
    void getSumTestInt() {
        int[] numbers = {1, 2, 3, 4, 5};

        assertEquals(15, numbersSum.getSum(numbers));
    }

    @Test
    void getSumTestIntWithNull() {
        int[] numbers = null;
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> numbersSum.getSum(numbers));

        assertEquals("Numbers is null.", exception.getMessage());
    }

    @Test
    void getSumTestString() {
        String[] numbers = {"1", "2", "3", "4", "5"};

        assertEquals(15, numbersSum.getSum(numbers));
    }

    @Test
    void getSumTestStringWithNull() {
        String[] numbers = null;
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> numbersSum.getSum(numbers));

        assertEquals("Numbers is null.", exception.getMessage());
    }

    @Test
    void getSumtestStringWithNotNumber() {
        String[] numbers = {"1", "2", "a", "4", "5"};
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> numbersSum.getSum(numbers));

        assertEquals("Input is not number: a", exception.getMessage());
    }
}