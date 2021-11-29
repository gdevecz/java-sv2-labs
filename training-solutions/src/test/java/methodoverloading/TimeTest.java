package methodoverloading;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeTest {

    @Test
    void createTest() {
        Time timeOne = new Time(20, 12, 30);
        Time timeTwo = new Time(timeOne);

        assertNotSame(timeOne, timeTwo);
        assertEquals(timeOne.getHours(), timeTwo.getHours());
        assertEquals(timeOne.getHours(), timeTwo.getHours());
        assertEquals(timeOne.getHours(), timeTwo.getHours());
    }

    @Test
    void isEqualTest() {
        Time time = new Time(20, 12, 30);
        Time timeEqual = new Time(new Time(20, 12, 30));
        Time timeEarlier = new Time(12, 10, 34);

        assertEquals(true, time.isEqual(20, 12, 30));
        assertEquals(true, time.isEqual(timeEqual));
        assertEquals(false, time.isEqual(timeEarlier));
    }

    @Test
    void isEarlierTest() {
        Time time = new Time(20, 12, 30);
        Time timeEqual = new Time(new Time(20, 12, 30));
        Time timeEarlier = new Time(12, 10, 34);

        assertEquals(false, time.isEarlier(20, 12, 30));
        assertEquals(false, time.isEarlier(timeEqual));
        assertEquals(false, time.isEarlier(timeEarlier));
        assertEquals(true, timeEarlier.isEarlier(time));
    }
}