package algorithmsdecision.towns;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TownTest {

    Town town = new Town();

    @Test
    void testContainsFewerHabitantsTure() {
        int limit = 120;
        List<Integer> sourceList = Arrays.asList(134, 200, 100, 145);

        boolean actual = town.containsFewerHabitants(sourceList, limit);

        assertEquals(true, actual);
    }

    @Test
    void testContainsFewerHabitantsFalse() {
        int limit = 10;
        List<Integer> sourceList = Arrays.asList(134, 200, 100, 145);

        boolean actual = town.containsFewerHabitants(sourceList, limit);

        assertEquals(false, actual);
    }

    @Test
    void testContainsFewerHabitantsIsNull() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> town.containsFewerHabitants(null, 100));

        assertEquals("The townPopulations is null!", exception.getMessage());
    }
}