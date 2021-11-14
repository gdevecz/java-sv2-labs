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
        mIO.printLabeledListNames(meetingRooms, "A tárgyalók sorrendben:");
    }

    public void printNamesReverse() {
        List<MeetingRoom> result = new ArrayList<>();

        for (int i = meetingRooms.size() - 1; i >= 0; i--) {
            result.add(meetingRooms.get(i));
        }
        mIO.printLabeledListNames(result, "A tárgyalók fordított sorrendben:");
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
                + getSinglePlural("tárgyaló", "", "k", result.size());
        mIO.printLabeledListNames(result, label);
    }

    public void printAreas() {
        String label = "A " +
                getSinglePlural("tágyaló", "", "k", meetingRooms.size()) + " " +
                getSinglePlural("területe", "", "i", meetingRooms.size());
        mIO.printLabeledListMeetingRooms(meetingRooms, label);
    }

    public void printMeetingRoomsFromName(String name) {
        List<MeetingRoom> result = new ArrayList<>();

        for (MeetingRoom meetingRoom : meetingRooms) {
            if (meetingRoom.getName().equals(name)) {
                result.add(meetingRoom);
            }
        }

        if (!result.isEmpty()) {
            String label = getSinglePlural("Találat", "", "ok", result.size())
                    + " " + getArticleToWord(name, false)
                    + " \"" + name + "\" névre:";
            mIO.printLabeledListMeetingRoomsButName(result, label);
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
            mIO.messageToConsole("Nincs találat " + getArticleToWord(part, false)
                    + " \"" + part + "\" névrészletre");
            return;
        }
        String label = getSinglePlural("Találat", "", "ok", result.size()) + " "
                + getArticleToWord(part, false) + " \"" + part + "\" névrészletre:";
        mIO.printLabeledListMeetingRooms(result, label);
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
        String label = getArticleToNumber(area, true) + " " + area + " m\u00B2-nél nagyobb "
                + getSinglePlural("tárgyaló", "", "k", result.size()) + ":";
        mIO.printLabeledListMeetingRooms(result, label);
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

    private String getArticleToNumber(int number, boolean startTheSentence) {
        if (number >= 10 && number < 20
                || number >= 100 && number < 200
                || number > 10000 && number < 20000) {
            return startTheSentence ? "A" : "a";
        }
        return getArticleToWord(Integer.toString(number), startTheSentence);
    }

    private String getArticleToWord(String word, boolean startTheSentence) {
        String privateers = "aáeéiíoóöőuúüű15";

        if (privateers.indexOf(word.toLowerCase().charAt(0)) != -1) {
            return startTheSentence ? "Az" : "az";
        }
        return startTheSentence ? "A" : "a";
    }

    private String getSinglePlural(String word, String single, String plural, int size) {
        if (size == 1) {
            return word + single;
        }
        return word + plural;
    }
}