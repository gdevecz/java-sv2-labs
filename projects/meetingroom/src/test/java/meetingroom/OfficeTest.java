package meetingroom;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OfficeTest {

    Office office = new Office();

    @Test
    void testAddMeetingRoom() {
        MeetingRoom meetingRoom = new MeetingRoom("test room",3,7);
        office.addMeetingRoom(meetingRoom);
        assertEquals(1,office.getMeetingRooms().size());
    }
}