package methodpass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WindowTest {

    Window window;



    @Test
    void testCreate() {
        String roomName = "living room";
        int width = 230;
        int height = 120;
        Window window = new Window(roomName,width,height);

        assertEquals(roomName, window.getRoomName());
        assertEquals(width, window.getWidth());
        assertEquals(height, window.getHeight());
    }

    @Test
    void testRiseSize() {
        String roomName = "living room";
        int width = 230;
        int height = 120;
        Window window = new Window(roomName,width,height);

        window.changeHeightWith(13);
        assertEquals(133, window.getHeight());
    }
}