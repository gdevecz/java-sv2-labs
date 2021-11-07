package meetingroom;

import java.util.ArrayList;
import java.util.List;

public class Office {

    private List<MeetingRoom> meetingRooms = new ArrayList<>();
    // Lehet kérdéses, és inkább paraméterlistán kellett volna átadni a konstruktoron kersztül (statikus metódusok hiányában)
    private MeetingRoomIO mIO = new MeetingRoomIO();


    public void addMeetingRoom(MeetingRoom meetingRoom) {
        meetingRooms.add(meetingRoom);
    }

    public void printNames() {
        mIO.printListOfNamesInLineWithLabel(meetingRooms, "A tárgyalók sorrendben:");
    }

    public void printNamesReverse() {
        List<MeetingRoom> assortedList = new ArrayList<>();
        for (int i = meetingRooms.size() - 1; i >= 0; i--) {
            assortedList.add(meetingRooms.get(i));
        }
        mIO.printListOfNamesInLineWithLabel(assortedList, "A tárgyalók fordított sorrendben:");
    }

    public void printEvenNames() {
        List<MeetingRoom> assortedList = new ArrayList<>();
        for (int i = 1; i < meetingRooms.size(); i += 2) {
            assortedList.add(meetingRooms.get(i));
        }
        String label = getLabelPattern("A páros számú tárgyaló%s:",
                new String[]{"", "k"},
                assortedList.size());
        mIO.printListOfNamesInLineWithLabel(assortedList, label);
    }

    public void printAreas() {
        List<MeetingRoom> assortedList = new ArrayList<>();
        mIO.printListOfMeetingRoomsWithLabel(meetingRooms, "A tágyalók területei:");
    }

    public void printMeetingRoomsFromName(String name) {
        List<MeetingRoom> assortedList = new ArrayList<>();
        for (MeetingRoom meetingRoom : meetingRooms) {
            if (meetingRoom.getName().equals(name)) {
                assortedList.add(meetingRoom);
            }
        }
        if (assortedList.size() > 0) {
            String patternForLabel = getLabelPattern("A találat%s a(z) \"" + name + "\" névre:",
                    new String[]{"", "ok"},
                    assortedList.size());
            mIO.printDifferentStyleDependsOnSize(assortedList, String.format(patternForLabel));
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
            String patternForLabel = getLabelPattern("A találat%s a(z) \"" + part + "\" névrészletre:",
                    new String[]{"", "ok"},
                    assortedList.size());
            mIO.printDifferentStyleDependsOnSize(assortedList, String.format(patternForLabel));
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
            String patternForLabel = getLabelPattern("A " + area + " m2-nél nagyobb tárgyaló%s:",
                    new String[]{"", "k"},
                    assortedList.size());
            if (assortedList.size() > 1) {
                mIO.printDifferentStyleDependsOnSize(assortedList, String.format(patternForLabel));
            } else {
                mIO.printMeetingRoomWithLabel(assortedList.get(0), String.format(patternForLabel));
            }
        }
    }

    public List<MeetingRoom> getMeetingRooms() {
        return meetingRooms;
    }

    private String getLabelPattern(String label, String[] change, int sizeOfList) {
        if (sizeOfList == 1) {
            return String.format(label, change[0]);
        }
        return String.format(label, change[1]);
    }

    public boolean checkNameInList(String name){
        for (MeetingRoom meetingRoom : meetingRooms) {
            if(meetingRoom.getName().equals(name)){
                return true;
            }
        }
        return false;
    }

    public boolean checkEmptyList() {
        if(meetingRooms.size()==0){
            return true;
        }
        return false;
    }
}