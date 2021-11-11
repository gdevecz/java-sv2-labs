package meetingroom4;

public class MeetingRoomControllerMain {

    public static void main(String[] args) {

        MeetingRoomController mrc = new MeetingRoomController();

        if (args.length > 0 && "test".equalsIgnoreCase(args[0])) {
            mrc.office.loadOfTestOffices();
        }
        mrc.runMenu();
    }
}
