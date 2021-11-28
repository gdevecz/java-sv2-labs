package methodparam.marriage;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class MarriageTest {

    @Test
    void getMarriedTest() {
        Woman expectedWoman = new Woman("Kovács Ilona");
        Man expectedMan = new Man("Pintér Sándor");
        Marriage marriage = new Marriage();
        marriage.getMarried(expectedWoman, expectedMan);

        assertEquals(1,expectedWoman.getRegisterDates().size());
        assertEquals(1,expectedMan.getRegisterDates().size());
        assertEquals(LocalDate.now(), expectedWoman.getRegisterDates().get(0).getDate());
        assertEquals(LocalDate.now(), expectedMan.getRegisterDates().get(0).getDate());
        assertEquals("Pintér Ilona", expectedWoman.getName());
        assertEquals("Pintér Sándor", expectedMan.getName());
    }
}