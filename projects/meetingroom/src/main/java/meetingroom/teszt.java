package meetingroom;

import java.util.ArrayList;
import java.util.Arrays;

public class teszt {

    public static void main(String[] args) {
        MeetingRoomIO mio = new MeetingRoomIO();
        Office office = new Office();

//        System.out.println(mio.labeledRequestAString("teszt string"));
//        System.out.println(mio.isStringValidInteger(" 3 "));
//        System.out.println(mio.isStringValidInteger(""));
//        System.out.println(mio.isStringValidInteger(" x "));
//        System.out.println(mio.labeledRequestANumber("teszt number"));
//        System.out.println(mio.requestANewMeetingRoom("új " + "tárgyaló"));
//        mio.printLabeledListOfMeetingRoomsButName(
//                new ArrayList<>(Arrays.asList(
//                        new MeetingRoom("teszt1", 7, 3),
//                        new MeetingRoom("teszt2", 5, 4)
//                )), "név nélküli lista");
//        mio.printLabeledListOfMeetingRooms(
//                new ArrayList<>(Arrays.asList(
//                        new MeetingRoom("teszt1", 7, 3),
//                        new MeetingRoom("teszt2ewwet", 5, 4)
//                )), "névesített lista");
////        office.addMeetingRoom(new MeetingRoom("teszt1", 7, 3));
//        office.addMeetingRoom(new MeetingRoom("teszt2", 5, 4));
        office.loadOfTestOffices();


    }
}
