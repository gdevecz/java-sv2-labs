package meetingroom;

public class MeetingRoomControllerMain {

    public static void main(String[] args) {

        MeetingRoomController mrc = new MeetingRoomController();

        if (args.length > 0 && "test".equalsIgnoreCase(args[0])) {
           new MeetingRoomControllerMain().loadTestOffice(mrc);
        }

        mrc.runMenu();
    }

    private void loadTestOffice(MeetingRoomController mrc) {
        mrc.getOffice().addMeetingRoom(new MeetingRoom("teszt1 tárgyaló", 7, 3));
        mrc.getOffice().addMeetingRoom(new MeetingRoom("ez egy teszt tárgyaló", 5, 4));
        mrc.getOffice().addMeetingRoom(new MeetingRoom("teSZt2", 13, 7));
        mrc.getOffice().addMeetingRoom(new MeetingRoom("teszt3", 41, 19));
        mrc.getOffice().addMeetingRoom(new MeetingRoom("a meeting room", 41, 20));
        mrc.getOffice().addMeetingRoom(new MeetingRoom("kiselőadó", 20, 18));
        mrc.getOffice().addMeetingRoom(new MeetingRoom("test1", 5, 5));
        mrc.getOffice().addMeetingRoom(new MeetingRoom("testMeetingRoom", 25, 25));
        mrc.getOffice().addMeetingRoom(new MeetingRoom("teszt3", 5, 2));
        mrc.getOffice().addMeetingRoom(new MeetingRoom("nagyelőadó", 47, 21));

        MeetingRoomIO mIO = new MeetingRoomIO();
        mIO.printLabeledListOfMeetingRooms(
                mrc.getOffice().getMeetingRooms(),
                "A progam a test agrumentummal a következő tesztesetekkel indul:");
        mIO.waitForEnter();
    }
}