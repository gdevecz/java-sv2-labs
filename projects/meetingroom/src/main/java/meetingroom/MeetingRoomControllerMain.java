package meetingroom;

import com.sun.tools.javac.Main;

public class MeetingRoomControllerMain {

    public static void main(String[] args) {

        MeetingRoomController mrc = new MeetingRoomController();

        if (args.length > 0 && "test".equalsIgnoreCase(args[0])) {
           new MeetingRoomControllerMain().loadTestOffices(mrc);
        }
        mrc.runMenu();
    }

    private void loadTestOffices(MeetingRoomController mrc) {
        mrc.office.addMeetingRoom(new MeetingRoom("teszt1", 7, 3));
        mrc.office.addMeetingRoom(new MeetingRoom("ez egy teszt tárgyaló", 5, 4));
        mrc.office.addMeetingRoom(new MeetingRoom("teSZt2", 13, 7));
        mrc.office.addMeetingRoom(new MeetingRoom("teszt3", 41, 24));
        mrc.office.addMeetingRoom(new MeetingRoom("a meeting room", 41, 24));
        mrc.office.addMeetingRoom(new MeetingRoom("teszt4", 20, 18));
        mrc.office.addMeetingRoom(new MeetingRoom("test1", 5, 5));
        mrc.office.addMeetingRoom(new MeetingRoom("testMeetingRoom", 25, 25));
        mrc.office.addMeetingRoom(new MeetingRoom("teszt3", 5, 2));
        mrc.mIO.printLabeledListOfMeetingRooms(mrc.office.getMeetingRooms(), "A progam a következő tesztesetekkel indul: ");
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Tovább: ENTER");
        sc.nextLine();
    }
}