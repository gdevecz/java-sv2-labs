package meetingroom;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class meetingRoomTest {
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
    void testToString() {
        String target = "testroom szélessége 3 m, hosszúsága 7 m, területe 21 m\u00B2";
        String source = meetingRoom.toString();
        assertEquals(target, source);
    }
}