package methodparam.marriage;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class WomanTest {

    Woman woman = new Woman("Legjobb Ágota");

    @Test
    void testCreate() {
        Woman womanCreate = new Woman("Hozé Luiz");

        assertEquals("Hozé Luiz", womanCreate.getName());
        assertEquals(0,womanCreate.getRegisterDates().size());
    }

    @Test
    void getChristianNameTest() {
        String expected = woman.getChristianName();

        assertEquals(expected, woman.getChristianName());
    }

    @Test
    void getFamilyNameTest() {
        String expected = woman.getFamilyName();

        assertEquals(expected, woman.getFamilyName());
    }

    @Test
    void addRegisterDateTest() {
        LocalDate expectedDate = LocalDate.of(2011,12,23);
        RegisterDate expected = new RegisterDate("Teszt", expectedDate);
        woman.addRegisterDate(expected);

        assertEquals(1, woman.getRegisterDates().size());
        assertSame(expected, woman.getRegisterDates().get(0));
        assertEquals("Teszt", woman.getRegisterDates().get(0).getDescription());
        assertSame(expectedDate, woman.getRegisterDates().get(0).getDate());
        assertEquals(expectedDate.toString(),woman.getRegisterDates().get(0).getDate().toString());
    }
}