package meetingroom;

import meetingroom4.MeetingRoom;
import meetingroom4.MeetingRoomIO;

import java.util.ArrayList;
import java.util.List;

public class Office {

    private List<meetingroom4.MeetingRoom> meetingRooms = new ArrayList<>();

    private meetingroom4.MeetingRoomIO mIO = new MeetingRoomIO();


    public void addMeetingRoom(meetingroom4.MeetingRoom meetingRoom) {
        meetingRooms.add(meetingRoom);
    }

    public void printNames() {
        mIO.printLabeledNamesInLine(meetingRooms, "A tárgyalók sorrendben:");
    }

    public void printNamesReverse() {
        List<meetingroom4.MeetingRoom> assortedList = new ArrayList<>();

        for (int i = meetingRooms.size() - 1; i >= 0; i--) {
            assortedList.add(meetingRooms.get(i));
        }
        mIO.printLabeledNamesInLine(assortedList, "A tárgyalók fordított sorrendben:");
    }

    public void printEvenNames() {
        List<meetingroom4.MeetingRoom> assortedList = new ArrayList<>();

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
        List<meetingroom4.MeetingRoom> assortedList = new ArrayList<>();

        for (meetingroom4.MeetingRoom meetingRoom : meetingRooms) {
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
        List<meetingroom4.MeetingRoom> assortedList = new ArrayList<>();

        for (meetingroom4.MeetingRoom meetingRoom : meetingRooms) {
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
        List<meetingroom4.MeetingRoom> assortedList = new ArrayList<>();

        for (meetingroom4.MeetingRoom meetingRoom : meetingRooms) {
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
        for (meetingroom4.MeetingRoom meetingRoom : meetingRooms) {
            if (meetingRoom.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public boolean checkEmptyList() {
        return meetingRooms.size() == 0;
    }

    public void loadOfTestOffices() {
        addMeetingRoom(new meetingroom4.MeetingRoom("teszt1", 7, 3));
        addMeetingRoom(new meetingroom4.MeetingRoom("ez egy teszt tárgyaló", 5, 4));
        addMeetingRoom(new meetingroom4.MeetingRoom("teSZt2", 13, 7));
        addMeetingRoom(new meetingroom4.MeetingRoom("teszt3", 41, 24));
        addMeetingRoom(new meetingroom4.MeetingRoom("a meeting room", 41, 24));
        addMeetingRoom(new meetingroom4.MeetingRoom("teszt4", 20, 18));
        addMeetingRoom(new meetingroom4.MeetingRoom("test1", 5, 5));
        addMeetingRoom(new meetingroom4.MeetingRoom("testMeetingRoom", 25, 25));
        addMeetingRoom(new meetingroom4.MeetingRoom("teszt3", 5, 2));
        mIO.printLabeledListOfMeetingRooms(meetingRooms, "A progam a következő tesztesetekkel indul: ");
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Tovább: ENTER");
        sc.nextLine();
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