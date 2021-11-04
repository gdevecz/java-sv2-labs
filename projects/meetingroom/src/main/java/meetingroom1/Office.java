package meetingroom1;

import java.util.ArrayList;
import java.util.List;

public class Office {

    private List<MeetingRoom> meetingRooms = new ArrayList<>();

    public void addMeetingRoom(MeetingRoom meetingRoom) {
        meetingRooms.add(meetingRoom);
    }

    public void printNames() {
        System.out.println("A tárgyalók sorrendben:");
        boolean first = true;
        StringBuilder sb = new StringBuilder();
        for (MeetingRoom meetingRoom : meetingRooms) {
            sb.append(meetingRoom.getName()).append(", ");
        }
        System.out.println(sb.substring(0, sb.length() - 2));
    }

    public void printNamesReverse() {
        System.out.println("A tárgyalók fordított sorrendben:");
        StringBuilder sb = new StringBuilder();
        for (int i = meetingRooms.size() - 1; i >= 0; i--) {
            sb.append(meetingRooms.get(i).getName()).append(", ");
        }
        System.out.println(sb.substring(0, sb.length() - 2));
    }

    public void printEvenNames() {
        System.out.println("A páros számú tárgyalók:");
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < meetingRooms.size(); i += 2) {
            sb.append(meetingRooms.get(i).getName()).append(", ");
        }
        System.out.println(sb.substring(0, sb.length() - 2));
    }

    public void printAreas() {
        System.out.println("A tárgyalók méretei:");
        for (MeetingRoom meetingRoom : meetingRooms) {
            System.out.println(meetingRoom);
        }
    }

    public void printMeetingRoomsWithName(String name) {
        StringBuilder sb = new StringBuilder();
        int hits = 0;
        int i = 0;
        for (MeetingRoom meetingRoom : meetingRooms) {
            if (meetingRoom.getName().equals(name)) {
                hits++;
                sb.append(meetingRoom).append("\n");
            }
        }
        if (hits == 1) {
            System.out.println(sb.substring(sb.indexOf(",") + 2, sb.length() - 1));
        } else if (hits > 1) {
            System.out.println(sb.substring(0, sb.length() - 1));
        }

    }

    public void printMeetingRoomContains(String part) {
        StringBuilder sb = new StringBuilder();
        int hits = 0;
        int i = 0;
        for (MeetingRoom meetingRoom : meetingRooms) {
            if (meetingRoom.getName().toLowerCase().contains(part.toLowerCase())) {
                hits++;
                sb.append(meetingRoom).append("\n");
            }
        }
        if (hits == 1) {
            System.out.println(sb.substring(sb.indexOf(",") + 2, sb.length() - 1));
        } else if (hits > 1) {
            System.out.println(sb.substring(0, sb.length() - 1));
        }
    }

    public void printAreasLargerThan(int area) {
        for (MeetingRoom meetingRoom : meetingRooms) {
            if (meetingRoom.getArea() > area) {
                System.out.println(meetingRoom);
            }
        }
    }
}
