package meetingroom;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MeetingRoomTest {
    MeetingRoom meetingRoom = new MeetingRoom("testroom", 7, 3);

    @Test
    void testCreate() {
        assertEquals("testroom", meetingRoom.getName());
        assertEquals(7, meetingRoom.getLength());
        assertEquals(3, meetingRoom.getWidth());
    }

    @Test
    void testGetArea() {
        assertEquals(21, meetingRoom.getArea());
    }
}