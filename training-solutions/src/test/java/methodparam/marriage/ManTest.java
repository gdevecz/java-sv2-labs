package methodparam.marriage;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ManTest {

    Man man = new Man("Legjobb Áron");

    @Test
    void testCreate() {
        Man manCreate = new Man("Hozé Luiz");

        assertEquals("Hozé Luiz", manCreate.getName());
        assertEquals(0,manCreate.getRegisterDates().size());
    }

    @Test
    void addRegisterDateTest() {
        LocalDate expectedDate = LocalDate.of(2011,12,23);
        RegisterDate expected = new RegisterDate("Teszt", expectedDate);
        man.addRegisterDate(expected);

        assertEquals(1, man.getRegisterDates().size());
        assertSame(expected, man.getRegisterDates().get(0));
        assertEquals("Teszt", man.getRegisterDates().get(0).getDescription());
        assertSame(expectedDate, man.getRegisterDates().get(0).getDate());
        assertEquals(expectedDate.toString(),man.getRegisterDates().get(0).getDate().toString());
    }


    @Test
    void getChristianNameTest() {
        String expected = man.getChristianName();

        assertEquals(expected, man.getChristianName());
    }

    @Test
    void getFamilyNameTest() {
        String expected = man.getFamilyName();

        assertEquals(expected, man.getFamilyName());
    }
}