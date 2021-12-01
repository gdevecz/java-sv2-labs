package inheritanceconstructor.classroom;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    void testCreate() {
        Room room = new Room("emelet",20);

        assertEquals("emelet", room.getLocation());
        assertEquals(20, room.getCapacity());
    }

}