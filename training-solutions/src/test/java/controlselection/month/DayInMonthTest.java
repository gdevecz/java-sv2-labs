package controlselection.month;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DayInMonthTest {
    DayInMonth dayInMonth = new DayInMonth();

    //
    @Test
    void testYearIsLeapYear() {
        assertEquals(false, dayInMonth.yearIsLeapYear(2021));
        assertEquals(true, dayInMonth.yearIsLeapYear(2020));
        assertEquals(false, dayInMonth.yearIsLeapYear(2200));
        assertEquals(true, dayInMonth.yearIsLeapYear(2400));
    }

    @Test
    void testMonthFromString() {
        assertEquals(Month.FEBRUAR, dayInMonth.monthFromString("fEbrUáR"));
    }

    @Test
    void testGetNumberOfDaysInMonth() {
        assertEquals(28,dayInMonth.getNumberOfDaysInMonth(2021,"február"));
        assertEquals(29,dayInMonth.getNumberOfDaysInMonth(2020,"február"));
        assertEquals(28,dayInMonth.getNumberOfDaysInMonth(2200,"február"));
        assertEquals(29,dayInMonth.getNumberOfDaysInMonth(2400,"február"));
    }
}