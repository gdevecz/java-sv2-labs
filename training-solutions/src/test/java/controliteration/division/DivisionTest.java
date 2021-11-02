package controliteration.division;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivisionTest {
    Division division = new Division();

    @Test
    void testBaseMultiples() {
        String target = "3, 6, 9, 12, 15, 18, 21, 24, 27, 30, 33";

        assertEquals(target, division.baseMultiples(35,3));
    }
}