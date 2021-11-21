package introexceptionthrowjunit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

public class TankTest {

    Tank tank = new Tank();

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void testModifyAngle() {
        assertThat(0, equalTo(tank.getAngle()));
        tank.modifyAngle(10);
        assertThat(10, equalTo(tank.getAngle()));
        tank.modifyAngle(-20);
        assertThat(350, equalTo(tank.getAngle()));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testModifyAngleFailedOne() {
        tank.modifyAngle(110);
    }

    @Test
    public void testModifyAngleFailedTwo() {
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("The new angle is unreachable!");
        tank.modifyAngle(-110);
    }

    @Test
    public void tesModifyAngleFailedThree() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> tank.modifyAngle(110));
        assertEquals("The new angle is unreachable!", exception.getMessage());
    }
}