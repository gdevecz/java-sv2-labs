package meetingroom;

import java.util.ArrayList;
import java.util.List;

public class Office {

    private List<MeetingRoom> meetingRooms = new ArrayList<>();
    private MeetingRoomIO mIO = new MeetingRoomIO();

    public void addMeetingRoom(MeetingRoom meetingRoom) {
        meetingRooms.add(meetingRoom);
    }

    public void printNames() {
        mIO.printListOfNamesInLineWithhLabel(meetingRooms, "A tárgyalók sorrendben:");
    }

    public void printNamesReverse() {
        List<MeetingRoom> assortedList = new ArrayList<>();
        for (int i = meetingRooms.size() - 1; i >= 0; i--) {
            assortedList.add(meetingRooms.get(i));
        }
        mIO.printListOfNamesInLineWithhLabel(assortedList, "A tárgyalók fordított sorrendben:");
    }

    public void printEvenNames() {
        List<MeetingRoom> assortedList = new ArrayList<>();
        for (int i = 1; i < meetingRooms.size(); i += 2) {
            assortedList.add(meetingRooms.get(i));
        }
        mIO.printListOfNamesInLineWithhLabel(assortedList, "A páros számú tárgyalók:");
    }

    public void printAreas() {
        List<MeetingRoom> assortedList = new ArrayList<>();
        System.out.println("A tárgyalók méretei:");
        for (MeetingRoom meetingRoom : meetingRooms) {
            System.out.println(meetingRoom);
        }

    }

    public void printMeetingRoomsFromName(String name) {
        List<MeetingRoom> assortedList = new ArrayList<>();
        for (MeetingRoom meetingRoom : meetingRooms) {
            if (meetingRoom.getName().equals(name)) {
                assortedList.add(meetingRoom);
            }
        }
        if (assortedList.size() > 0) {
            String patternForLabel = "A találat%s a(z) \"" + name + "\" névre:";
            String changingText = "";
            if (assortedList.size() > 1) {
                changingText = "ok";
            }
            mIO.printDifferentStyleDependsOnSize(assortedList, String.format(patternForLabel, changingText));
        }
    }

    public void printMeetingRoomContains(String part) {
        List<MeetingRoom> assortedList = new ArrayList<>();
        for (MeetingRoom meetingRoom : meetingRooms) {
            if (meetingRoom.getName().toLowerCase().contains(part.toLowerCase())) {
                assortedList.add(meetingRoom);
            }
        }
        if (assortedList.size() > 0) {
            String patternForLabel = "A találat%s a(z) \"" + part + "\" névrészletre:";
            String changingText = "";
            if (assortedList.size() > 1) {
                changingText = "ok";
            }
            mIO.printDifferentStyleDependsOnSize(assortedList, String.format(patternForLabel, changingText));
        }

    }

    public void printAreasLargerThan(int area) {
        List<MeetingRoom> assortedList = new ArrayList<>();
        for (MeetingRoom meetingRoom : meetingRooms) {
            if (meetingRoom.getArea() > area) {
                assortedList.add(meetingRoom);
            }
        }
        if (assortedList.size() > 0) {
            String patternForLabel = "A " + area + "m2-nél nagyobb tárgyaló%s:";
            String changingText = "";
            if (assortedList.size() > 1) {
                changingText = "k";
                mIO.printDifferentStyleDependsOnSize(assortedList, String.format(patternForLabel, changingText));
            } else {
                mIO.printMeetingRoomWithLabel(assortedList.get(0), String.format(patternForLabel, changingText));
            }
        }
    }
}