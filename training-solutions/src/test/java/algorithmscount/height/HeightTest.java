package algorithmscount.height;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HeightTest {

    @Test
    void testCountChildrenWithHeightGreaterThan() {
        Height height = new Height();
        List<Integer> source = Arrays.asList(145, 149, 150, 151, 166);
        int actual = height.countChildrenWithHeightGreaterThan(source, 150);

        assertEquals(3, actual);
    }
}