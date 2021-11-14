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
        mIO.printLabeledListOfNames(meetingRooms, "A tárgyalók sorrendben:");
    }

    public void printNamesReverse() {
        List<MeetingRoom> result = new ArrayList<>();

        for (int i = meetingRooms.size() - 1; i >= 0; i--) {
            result.add(meetingRooms.get(i));
        }
        mIO.printLabeledListOfNames(result, "A tárgyalók fordított sorrendben:");
    }

    public void printEvenNames() {
        List<MeetingRoom> result = new ArrayList<>();

        if (meetingRooms.size() < 2) {
            mIO.messageToConsole("Csak egyetlen tárgyaló van a listában, nincs mit megjeleníteni.");
            return;
        }
        for (int i = 1; i < meetingRooms.size(); i += 2) {
            result.add(meetingRooms.get(i));
        }
        String label = "A páros számú "
                + getSingleOrPlural("tárgyaló", "", "k", result.size());
        mIO.printLabeledListOfNames(result, label);
    }

    public void printAreas() {
        String label = "A " +
                getSingleOrPlural("tágyaló", "", "k", meetingRooms.size()) + " " +
                getSingleOrPlural("területe", "", "i", meetingRooms.size());
        mIO.printLabeledListOfMeetingRooms(meetingRooms, label);
    }

    public void printMeetingRoomsFromName(String name) {
        List<MeetingRoom> result = new ArrayList<>();

        for (MeetingRoom meetingRoom : meetingRooms) {
            if (meetingRoom.getName().equals(name)) {
                result.add(meetingRoom);
            }
        }

        if (!result.isEmpty()) {
            String label = getSingleOrPlural("Találat", "", "ok", result.size())
                    + " " + getArticleToAWord(name, false)
                    + " \"" + name + "\" névre:";
            mIO.printLabeledListOfMeetingRoomsButName(result, label);
        }
    }

    public void printMeetingRoomContains(String part) {
        List<MeetingRoom> result = new ArrayList<>();

        for (MeetingRoom meetingRoom : meetingRooms) {
            if (meetingRoom.getName().toLowerCase().contains(part.toLowerCase())) {
                result.add(meetingRoom);
            }
        }

        if (result.isEmpty()) {
            mIO.messageToConsole("Nincs találat " + getArticleToAWord(part, false)
                    + " \"" + part + "\" névrészletre");
            return;
        }
        String label = getSingleOrPlural("Találat", "", "ok", result.size()) + " "
                + getArticleToAWord(part, false) + " \"" + part + "\" névrészletre:";
        mIO.printLabeledListOfMeetingRooms(result, label);
    }

    public void printAreasLargerThan(int area) {
        List<MeetingRoom> result = new ArrayList<>();

        for (MeetingRoom meetingRoom : meetingRooms) {
            if (meetingRoom.getArea() > area) {
                result.add(meetingRoom);
            }
        }

        if (result.size() == 0) {
            mIO.messageToConsole("Nem találtam " + area + " m\u00B2-nél nagyobb tárgyalót.");
            return;
        }
        String label = getArticleToANumber(area, true) + " " + area + " m\u00B2-nél nagyobb "
                + getSingleOrPlural("tárgyaló", "", "k", result.size()) + ":";
        mIO.printLabeledListOfMeetingRooms(result, label);
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