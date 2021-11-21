package introexceptionthrowjunit5;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

class TankTest {

    Tank tank = new Tank();

    @Test
    void testModifyAngle() {
        assertEquals(0, tank.getAngle());
        tank.modifyAngle(10);
        assertEquals(10, tank.getAngle());
        tank.modifyAngle(-20);
        assertEquals(350, tank.getAngle());
    }

    @Test
    public void tesModifyAngleFailedThree() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                ()-> tank.modifyAngle(-110));
        assertEquals("The new angle is unreachable!", exception.getMessage());
    }
}