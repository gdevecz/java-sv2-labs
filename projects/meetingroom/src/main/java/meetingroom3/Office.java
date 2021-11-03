package meetingroom3;

import java.util.ArrayList;
import java.util.List;

public class Office {

    MeetingRoomIO mIO = new MeetingRoomIO();

    private List<MeetingRoom> meetingRooms = new ArrayList<>();

    public void addMeetingRoom(MeetingRoom newMeetingRoom) {
        meetingRooms.add(newMeetingRoom);
    }

    public void printNames() {
        mIO.printLabeledListOfNamesInLine(meetingRooms, "A tárgyalók sorrendben:");
    }

    public void printNamesReverse() {
        List<MeetingRoom> assortedList = new ArrayList<>();
        for (int i = meetingRooms.size() - 1; i >= 0; i--) {
            assortedList.add(meetingRooms.get(i));
        }
        mIO.printLabeledListOfNamesInLine(assortedList, "A tárgyalók fordított sorrendben:");
    }

    public void printEvenNames() {
        List<MeetingRoom> assortedList = new ArrayList<>();
        for (int i = 1; i < meetingRooms.size(); i += 2) {
            assortedList.add(meetingRooms.get(i));
        }
        mIO.printLabeledListOfNamesInLine(assortedList, "A páros számú tárgyalók:");
    }

    public void printAreas() {
        mIO.printListOfOMeetingRooms(meetingRooms, "A tárgyalók méretei:");
    }

    public void printMeetingRoomsWithName(String name) {
        List<MeetingRoom> assortedList = new ArrayList<>();
        for (MeetingRoom meetingRoom : meetingRooms) {
            if (meetingRoom.getName().equals(name)) {
                assortedList.add(meetingRoom);
            }
        }
        mIO.differentPrintOneOrMoreList(assortedList, "Több " + name + " nevű találat: ");
    }

    public void printMeetingRoomContains(String part) {
        List<MeetingRoom> assortedList = new ArrayList<>();
        for (MeetingRoom meetingRoom : meetingRooms) {
            if (meetingRoom.getName().toLowerCase().contains(part.toLowerCase())) {
                assortedList.add(meetingRoom);
            }
        }
        if (assortedList.size() > 0) {
            mIO.differentPrintOneOrMoreList(assortedList, "Több " + part + " névrészlet találat: ");
        }
    }

    public void printAreasLargerThan(int area) {
        List<MeetingRoom> assortedList = new ArrayList<>();
        for (MeetingRoom meetingRoom : meetingRooms) {
            if (meetingRoom.getArea() > area) {
                assortedList.add(meetingRoom);
            }
        }
        mIO.differentPrintOneOrMoreList(assortedList,"A megadott ( "+area+") területnél nagyobb tárgyalók:" );
    }
}
