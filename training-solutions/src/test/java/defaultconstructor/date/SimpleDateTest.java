package defaultconstructor.date;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleDateTest {

    SimpleDate simpleDate = new SimpleDate();

    @Test
    void setDateTest() {
        simpleDate.setDate(2011, 12, 11);

        assertEquals(2011, simpleDate.getYear());
        assertEquals(12, simpleDate.getMonth());
        assertEquals(11, simpleDate.getDay());
    }

    @Test
    void setDateFailedTest() {
        IllegalArgumentException exceptionYear = assertThrows(IllegalArgumentException.class,
                () -> simpleDate.setDate(1800, 3, 3));
        IllegalArgumentException exceptionMonthOne = assertThrows(IllegalArgumentException.class,
                () -> simpleDate.setDate(2011, 13, 3));
        IllegalArgumentException exceptionMonthTwo = assertThrows(IllegalArgumentException.class,
                () -> simpleDate.setDate(2011, -11, 3));
        IllegalArgumentException exceptionDayOne = assertThrows(IllegalArgumentException.class,
                () -> simpleDate.setDate(2100, 2, 29));
        IllegalArgumentException exceptionDayTwo = assertThrows(IllegalArgumentException.class,
                () -> simpleDate.setDate(2011, 2, 29));

        assertEquals("The year is invalid: 1800", exceptionYear.getMessage());
        assertEquals("The month is invalid: 13", exceptionMonthOne.getMessage());
        assertEquals("The month is invalid: -11", exceptionMonthTwo.getMessage());
        assertEquals("The day is invalid: 29", exceptionDayOne.getMessage());
        assertEquals("The day is invalid: 29", exceptionDayTwo.getMessage());
    }
}