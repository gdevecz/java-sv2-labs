package methodparam.marriage;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class RegisterDateTest {

    @Test
    void testCreate() {
        RegisterDate rd = new RegisterDate("teszt leírás", LocalDate.of(2011, 10, 12));

        assertEquals("teszt leírás", rd.getDescription());
        assertEquals(LocalDate.of(2011, 10, 12),rd.getDate());
    }
}