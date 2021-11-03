package meetingroom3;

import java.util.List;
import java.util.Scanner;

public class MeetingRoomIO {

    public void printMenu() {
        System.out.println("\n1. Tárgyaló rögzítése\n"
                + "2. Tárgyalók sorrendben\n"
                + "3. Tárgyalók visszafele sorrendben\n"
                + "4. Minden második tárgyaló\n"
                + "5. Területek\n"
                + "6. Keresés pontos név alapján\n"
                + "7. Keresés névtöredék alapján\n"
                + "8. Keresés terület alapján\n"
                + "9. Kilépés");
    }

    public String labeledRequestAName(String label) {
        Scanner sc = new Scanner(System.in);
        System.out.print(label);
        return sc.nextLine();
    }

    public int labeledRequestANumber(String label) {
        Scanner sc = new Scanner(System.in);
        System.out.print(label);
        return sc.nextInt();
    }

    public MeetingRoom requestAMeetingRoom(String label) {
        System.out.println(label);
        String name = labeledRequestAName("      név: ");
        int width = labeledRequestANumber("szélesség: ");
        int length = labeledRequestANumber("hosszúság: ");
        return new MeetingRoom(name, length, width);
    }

    public String requestLabeledText(String label) {
        Scanner sc = new Scanner(System.in);
        System.out.println(label);
        return sc.nextLine();
    }

    public int requestLabeledNumber(String label) {
        Scanner sc = new Scanner(System.in);
        System.out.println(label);
        return sc.nextInt();
    }

    public void printListOfOMeetingRooms(List<MeetingRoom> meetingRooms, String label) {
        System.out.println(label);
        StringBuilder sb = new StringBuilder();
        int[] fieldSizes = fieldSizes(meetingRooms);
        String columNames = getPatterForFormat(fieldSizes, false);
        System.out.printf(columNames + "\n", "tárgyaló:", "szél.:", "hossz.:", "ter.:");
        for (MeetingRoom meetingRoom : meetingRooms) {
            sb.append(printMeetingRoomWithFieldsWidth(meetingRoom, fieldSizes) + "\n");
        }
        System.out.println(sb.substring(0, sb.length() - 1));
    }

    public void printLabeledListOfNamesInLine(List<MeetingRoom> meetingRooms, String label) {
        System.out.println(label);
        StringBuilder sb = new StringBuilder();
        boolean first = true;
        for (MeetingRoom meetingRoom : meetingRooms) {
            if (first) {
                first = false;
            } else {
                sb.append(" ");
            }
            sb.append(meetingRoom.getName());
        }
        System.out.println(sb);
    }

    public void printMeetingRoomWithoutName(MeetingRoom meetingRoom) {
        System.out.println(meetingRoom.getWidth()
                + ", szélesség: " + meetingRoom.getLength()
                + ", hosszúság: " + meetingRoom.getArea());
    }

    public void differentPrintOneOrMoreList(List<MeetingRoom> meetingRooms, String label) {
        if (meetingRooms.size() == 1) {
            System.out.println("A " + meetingRooms.get(0).getName() + " tárgyaló adatai:");
            printMeetingRoomWithoutName(meetingRooms.get(0));
        }
        if (meetingRooms.size() > 1) {
            printListOfOMeetingRooms(meetingRooms, label);
        }
    }

    private int[] fieldSizes(List<MeetingRoom> meetingRooms) {
        int sizeOfNames = "tárgyaló:".length();
        int sizeOfWidth = "szél.:".length();
        int sizeOfLength = "hossz.:".length();
        int sizeOfArea = "ter.:".length();
        for (MeetingRoom meetingRoom : meetingRooms) {
            if (meetingRoom.getName().length() > sizeOfNames) {
                sizeOfNames = meetingRoom.getName().length();
            }
            if (Integer.toString(meetingRoom.getWidth()).length() > sizeOfWidth) {
                sizeOfWidth = Integer.toString(meetingRoom.getWidth()).length();
            }
            if (Integer.toString(meetingRoom.getLength()).length() > sizeOfLength) {
                sizeOfLength = Integer.toString(meetingRoom.getLength()).length();
            }
            if (Integer.toString(meetingRoom.getArea()).length() > sizeOfArea) {
                sizeOfArea = Integer.toString(meetingRoom.getArea()).length();
            }
        }
        return new int[]{sizeOfNames,
                sizeOfWidth,
                sizeOfLength,
                sizeOfArea};
    }

    private String printMeetingRoomWithFieldsWidth(MeetingRoom meetingRoom, int[] fieldsWidths) {
        String tmp = getPatterForFormat(fieldsWidths, true);
        return String.format(tmp,
                meetingRoom.getName(),
                meetingRoom.getWidth(),
                meetingRoom.getLength(),
                meetingRoom.getArea());
    }

    private String getPatterForFormat(int[] fieldsWidths, boolean isMeetingroom) {
        String fillerFirst = isMeetingroom ?"s ": "s ";
        String filler = isMeetingroom?"d ": "s ";
        return "%" + fieldsWidths[0] + fillerFirst
                + "%" + fieldsWidths[1] + filler
                + "%" + fieldsWidths[2] + filler
                + "%" + fieldsWidths[3] + filler;
    }
}
