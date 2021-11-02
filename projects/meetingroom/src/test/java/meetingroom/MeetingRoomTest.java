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

    @Test
    void testReserved() {
        assertNotEquals(true, meetingRoom.isReserved());
        assertEquals(false,meetingRoom.isReserved());
        meetingRoom.setReserved();
        assertEquals(true,meetingRoom.isReserved());
        meetingRoom.setFree();
        assertEquals(false, meetingRoom.isReserved());

    }
}