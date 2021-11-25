package methodpass;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WindowOperationTest {

    List<Window> windows;

    @BeforeEach
    void init() {
        windows = Arrays.asList(
                new Window("living room", 223, 130),
                new Window("bedroom", 211, 120)
        );
    }

    @Test
    void testRiseSize() {
        WindowOperation windowOperation = new WindowOperation();
        windowOperation.riseSize(windows,10);

        assertEquals(140,windows.get(0).getHeight());
        assertEquals(130,windows.get(1).getHeight());
    }
}