package meetingroom;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OfficeTest {

    Office office = new Office();

    @Test
    void testGetMeetingRoom() {
        assertNotNull(office.getMeetingRooms());
        assertEquals(0,office.getMeetingRooms().size());
    }

    @Test
    void testAddMeetingRoom() {
        MeetingRoom meetingRoom = new MeetingRoom("test room",3,7);
        office.addMeetingRoom(meetingRoom);

        assertEquals(1,office.getMeetingRooms().size());
    }

    @Test
    void testCheckNameInList() {
        MeetingRoom meetingRoom = new MeetingRoom("test room",3,7);
        office.addMeetingRoom(meetingRoom);

        assertEquals(true,office.checkNameInList("test room"));
        assertEquals(false,office.checkNameInList("TeSt RoOm"));
    }

    @Test
    void testCheckEmptyList() {
        assertEquals(true,office.checkEmptyList());

        MeetingRoom meetingRoom = new MeetingRoom("test room",3,7);
        office.addMeetingRoom(meetingRoom);
        assertEquals(false, office.checkEmptyList());
    }
}