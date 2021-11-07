package meetingroom;

public class MeetingRoomControllerMain {

    public static void main(String[] args) {

        MeetingRoomController mrc = new MeetingRoomController();

        mrc.office.addMeetingRoom(new MeetingRoom("teszt1", 7, 3));
        mrc.office.addMeetingRoom(new MeetingRoom("teSZt2", 13, 7));
        mrc.office.addMeetingRoom(new MeetingRoom("teszt3", 41, 24));
        mrc.office.addMeetingRoom(new MeetingRoom("teszt4", 20, 18));
        mrc.office.addMeetingRoom(new MeetingRoom("test1", 5, 5));
        mrc.office.addMeetingRoom(new MeetingRoom("testMeetingRoom", 25, 25));
        mrc.office.addMeetingRoom(new MeetingRoom("teszt3", 5, 2));

        mrc.runMenu();
    }
}
