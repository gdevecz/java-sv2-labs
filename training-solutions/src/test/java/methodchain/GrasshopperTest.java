package methodchain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GrasshopperTest {

    Grasshopper grasshopper = new Grasshopper();
    @Test
    void hopOnceTest() {
        grasshopper.hopOnce(Direction.POSITIVE);

        assertEquals(1, grasshopper.getPosition());
        assertEquals(0,grasshopper.hopOnce(Direction.NEGATIVE).getPosition());
    }

    @Test
    void moveFromZeroToThreeWithFiveHopsTest() {
        grasshopper.moveFromZeroToThreeWithFiveHops();

        assertEquals(3,grasshopper.getPosition());
    }
}