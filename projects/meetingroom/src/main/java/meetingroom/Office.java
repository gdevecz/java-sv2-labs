package meetingroom;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Office {

    private List<MeetingRoom> meetingRooms = new ArrayList<>();

    private MeetingRoomIO mIO = new MeetingRoomIO();


    public void addMeetingRoom(MeetingRoom meetingRoom) {
        meetingRooms.add(meetingRoom);
    }

    public void printNames() {
        mIO.printLabeledNamesInLine(meetingRooms, "A tárgyalók sorrendben:");
    }

    public void printNamesReverse() {
        List<MeetingRoom> assortedList = new ArrayList<>();

        for (int i = meetingRooms.size() - 1; i >= 0; i--) {
            assortedList.add(meetingRooms.get(i));
        }
        mIO.printLabeledNamesInLine(assortedList, "A tárgyalók fordított sorrendben:");
    }

    public void printEvenNames() {
        List<MeetingRoom> assortedList = new ArrayList<>();

        if (meetingRooms.size() < 2) {
            mIO.messageToConsole("Csak egyetlen tárgyaló van a listában, nincs mit megjeleníteni.");
            return;
        }
        for (int i = 1; i < meetingRooms.size(); i += 2) {
            assortedList.add(meetingRooms.get(i));
        }
        String label = "A páros számú "
                + getSingleOrPlural("tárgyaló", "", "k", assortedList.size());
        mIO.printLabeledNamesInLine(assortedList, label);
    }

    public void printAreas() {
        String label = "A " +
                getSingleOrPlural("tágyaló", "", "k", meetingRooms.size()) + " " +
                getSingleOrPlural("területe", "", "i", meetingRooms.size());
        mIO.printLabeledListOfMeetingRooms(meetingRooms, label);
    }

    public void printMeetingRoomsFromName(String name) {
        List<MeetingRoom> assortedList = new ArrayList<>();

        for (MeetingRoom meetingRoom : meetingRooms) {
            if (meetingRoom.getName().equals(name)) {
                assortedList.add(meetingRoom);
            }
        }

        if (!assortedList.isEmpty()) {
            String label = getSingleOrPlural("Találat", "", "ok", assortedList.size())
                    + " " + getArticleToAWord(name, false)
                    + " \"" + name + "\" névre:";
            mIO.printLabeledListOfMeetingRoomsButName(assortedList, label);
        }
    }

    public void printMeetingRoomContains(String part) {
        List<MeetingRoom> assortedList = new ArrayList<>();

        for (MeetingRoom meetingRoom : meetingRooms) {
            if (meetingRoom.getName().toLowerCase().contains(part.toLowerCase())) {
                assortedList.add(meetingRoom);
            }
        }

        if (assortedList.isEmpty()) {
            mIO.messageToConsole("Nincs találat " + getArticleToAWord(part, false)
                    + " \"" + part + "\" névrészletre");
            return;
        }
        String label = getSingleOrPlural("Találat", "", "ok", assortedList.size()) + " "
                + getArticleToAWord(part, false) + " \"" + part + "\" névrészletre:";
        mIO.printLabeledListOfMeetingRooms(assortedList, label);
    }

    public void printAreasLargerThan(int area) {
        List<MeetingRoom> assortedList = new ArrayList<>();

        for (MeetingRoom meetingRoom : meetingRooms) {
            if (meetingRoom.getArea() > area) {
                assortedList.add(meetingRoom);
            }
        }

        if (assortedList.size() == 0) {
            mIO.messageToConsole("Nem találtam " + area + " m\u00B2-nél nagyobb tárgyalót.");
            return;
        }
        String label = getArticleToANumber(area, true) + " " + area + " m\u00B2-nél nagyobb "
                + getSingleOrPlural("tárgyaló", "", "k", assortedList.size()) + ":";
        mIO.printLabeledListOfMeetingRooms(assortedList, label);
    }

    public boolean checkNameInList(String name) {
        for (MeetingRoom meetingRoom : meetingRooms) {
            if (meetingRoom.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public boolean checkEmptyList() {
        return meetingRooms.size() == 0;
    }



    public List<MeetingRoom> getMeetingRooms() {
        return meetingRooms;
    }

    private String getArticleToANumber(int number, boolean startTheSentence) {
        if (number >= 10 && number < 20
                || number >= 100 && number < 200
                || number > 10000 && number < 20000) {
            return startTheSentence ? "A" : "a";
        }
        return getArticleToAWord(Integer.toString(number), startTheSentence);
    }

    private String getArticleToAWord(String word, boolean startTheSentence) {
        String privateers = "aáeéiíoóöőuúüű15";

        if (privateers.indexOf(word.toLowerCase().charAt(0)) != -1) {
            return startTheSentence ? "Az" : "az";
        }
        return startTheSentence ? "A" : "a";
    }

    private String getSingleOrPlural(String word, String single, String plural, int size) {
        if (size == 1) {
            return word + single;
        }
        return word + plural;
    }
}