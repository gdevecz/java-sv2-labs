package meetingroom2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Office {

    private List<MeetingRoom> meetingRooms = new ArrayList<>();

    public void addMeetingRoom(MeetingRoom meetingRoom) {
        meetingRooms.add(meetingRoom);
    }

    public void printNames() {
        printLabeledListOfNamesInLine(meetingRooms, "A tárgyalók sorrendben:");
    }

    public void printNamesReverse() {
        List<MeetingRoom> assortedList = new ArrayList<>();
        for (int i = meetingRooms.size() - 1; i >= 0; i--) {
            assortedList.add(meetingRooms.get(i));
        }
        printLabeledListOfNamesInLine(assortedList, "A tárgyalók fordított sorrendben:");
    }

    public void printEvenNames() {
        List<MeetingRoom> assortedList = new ArrayList<>();
        for (int i = 1; i < meetingRooms.size(); i += 2) {
            assortedList.add(meetingRooms.get(i));
        }
        printLabeledListOfNamesInLine(assortedList, "A páros számú tárgyalók:");
    }

    public void printAreas() {
        printListOfOMeetingRooms(meetingRooms, "A tárgyalók méretei:");
    }

    public void printMeetingRoomsWithName(String name) {
        List<MeetingRoom> assortedList = new ArrayList<>();
        for (MeetingRoom meetingRoom : meetingRooms) {
            if (meetingRoom.getName().equals(name)) {
                assortedList.add(meetingRoom);
            }
        }
        differentPrintOneOrMoreList(assortedList, "Több " + name + " nevű találat: ");
    }

    public void printMeetingRoomContains(String part) {
        List<MeetingRoom> assortedList = new ArrayList<>();
        for (MeetingRoom meetingRoom : meetingRooms) {
            if (meetingRoom.getName().toLowerCase().contains(part.toLowerCase())) {
                assortedList.add(meetingRoom);
            }
        }
        if (assortedList.size() > 0) {
            differentPrintOneOrMoreList(assortedList, "Több " + part + " névrészlet találat: ");
        }
    }

    public void printAreasLargerThan(int area) {
        for (MeetingRoom meetingRoom : meetingRooms) {
            if (meetingRoom.getArea() > area) {
                System.out.println(meetingRoom);
            }
        }
    }

    private String scanLabeledText(String label) {
        Scanner sc = new Scanner(System.in);
        System.out.println(label);
        return sc.nextLine();
    }

    private int scanLabeledNumber(String label) {
        Scanner sc = new Scanner(System.in);
        System.out.println(label);
        return sc.nextInt();
    }

    private void printListOfOMeetingRooms(List<MeetingRoom> meetingRooms, String label) {
        System.out.println(label);
        StringBuilder sb = new StringBuilder();
        for (MeetingRoom meetingRoom : meetingRooms) {
            sb.append(meetingRoom + "\n");
        }
        System.out.println(sb.substring(0, sb.length() - 1));
    }

    private void printLabeledListOfNamesInLine(List<MeetingRoom> meetingRooms, String label) {
        System.out.println(label);
        StringBuilder sb = new StringBuilder();
        boolean first = true;
        for (MeetingRoom meetingRoom : meetingRooms) {
            if (first) {
                first = false;
            } else {
                sb.append(", ");
            }
            sb.append(meetingRoom.getName());
        }
        System.out.println(sb);
    }

    private void printMeetingRoomWithoutName(MeetingRoom meetingRoom) {
        System.out.println(meetingRoom.getWidth()
                + ", szélesség: " + meetingRoom.getLength()
                + ", hosszúság" + meetingRoom.getArea());
    }

    private void differentPrintOneOrMoreList(List<MeetingRoom> meetingRooms, String label) {
        if (meetingRooms.size() == 1) {
            printMeetingRoomWithoutName(meetingRooms.get(0));
        }
        if (meetingRooms.size() > 1) {
            printListOfOMeetingRooms(meetingRooms, label);
        }
    }
}
