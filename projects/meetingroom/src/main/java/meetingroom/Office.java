package meetingroom;

import java.util.ArrayList;
import java.util.List;

public class Office {

    private List<MeetingRoom> meetingRooms = new ArrayList<>();

    public void addMeetingRoom(MeetingRoom meetingRoom) {
        meetingRooms.add(meetingRoom);
    }

    public void printNames() {
        System.out.println("A tárgyalók sorrendben:");
        for (MeetingRoom meetingRoom : meetingRooms) {
            System.out.println(meetingRoom.getName());
        }
    }

    public void printNamesReverse() {
        System.out.println("A tárgyalók fordított sorrendben:");
        for (int i = meetingRooms.size() - 1; i >= 0; i++) {
            System.out.println(meetingRooms.get(i).getName());
        }
    }

    public void printEvenNames() {
        System.out.println("A páros számú tárgyalók:");
        for (int i = 1; i < meetingRooms.size(); i += 2) {
            System.out.println(meetingRooms.get(i).getName());
        }
    }

    public void printAreas() {
        System.out.println("A tárgyalók méretei:");
        for (MeetingRoom meetingRoom : meetingRooms) {
            System.out.println(meetingRoom);
        }
    }

    public void printMeetingRoomsWithName(String name) {
        int i = 0;
        while (i < meetingRooms.size()
                && !(meetingRooms.get(i).getName().equals(name))) {
            i++;
        }
        if (i < meetingRooms.size()) {
            String result = meetingRooms.get(i).toString();
            System.out.println(result.substring(result.indexOf(',') + 2));
        }
    }

    public void printMeetingRoomContains(String part) {
        for (MeetingRoom meetingRoom : meetingRooms) {
            if(meetingRoom.getName().contains(part)){
                String result = meetingRooms.toString();
                System.out.println(result.substring(result.indexOf(',') + 2));
            }
        }
    }

    public void printAreasLargerThan(int area) {
        for (MeetingRoom meetingRoom :meetingRooms) {
            if(meetingRoom.getArea() > area) {
                System.out.println(meetingRoom);
            }
        }
    }
}
