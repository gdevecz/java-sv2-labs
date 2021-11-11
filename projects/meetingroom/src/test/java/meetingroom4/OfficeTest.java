package meetingroom4;

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
        meetingRoom meetingRoom = new meetingRoom("test room",3,7);
        office.addMeetingRoom(meetingRoom);

        assertEquals(1,office.getMeetingRooms().size());
    }

    @Test
    void testCheckNameInList() {
        meetingRoom meetingRoom = new meetingRoom("test room",3,7);
        office.addMeetingRoom(meetingRoom);

        assertEquals(true,office.checkNameInList("test room"));
        assertEquals(false,office.checkNameInList("TeSt RoOm"));
    }

    @Test
    void testCheckEmptyList() {
        assertEquals(true,office.checkEmptyList());

        meetingRoom meetingRoom = new meetingRoom("test room",3,7);
        office.addMeetingRoom(meetingRoom);

        assertEquals(false, office.checkEmptyList());
    }
}