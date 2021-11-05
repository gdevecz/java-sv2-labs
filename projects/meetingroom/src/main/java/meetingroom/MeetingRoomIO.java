package meetingroom;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class MeetingRoomIO {

    //nem akartam többször példányosítani, nem tudom, mi a szokás, külön metódusonként vagy lehet így is
    private Scanner sc = new Scanner(System.in);
    private StringBuilder sb = new StringBuilder(200);

    public void printMenu() {
        //cls hiányában nyitó \n a szeparáláshoz
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

    public String labeledRequestAString(String label) {
        System.out.print(label);
        return sc.nextLine();
    }

    public int labeledRequestANumber(String label) {
        System.out.print(label);
        String numberString;
        while (!isStringValidInteger(numberString = sc.nextLine().strip())) {
            System.out.print("A megadott adat nem szám, kérem adja meg újra!\n" + label);
        }
        return Integer.parseInt(numberString);
    }

    public MeetingRoom requestANewMeetingRoom(String label) {
        System.out.println(label);
        String name = labeledRequestAString("      név: ");
        int width = labeledRequestANumber("szélesség: ");
        int length = labeledRequestANumber("hosszúság: ");
        return new MeetingRoom(name, length, width);
    }

    public void printListOfMeetingRoomsWithLabel(List<MeetingRoom> meetingRooms, String label) {
        System.out.println(label);
        printListOfOMeetingRooms(meetingRooms);
    }

    public void printListOfOMeetingRooms(List<MeetingRoom> meetingRooms) {
        int maxWidthOfNames = getMaxWithOfNames(meetingRooms);
        boolean first = true;
        for (MeetingRoom meetingRoom : meetingRooms) {
            sb.delete(0, sb.length());
            sb.append(String.format("%" + maxWidthOfNames + "s %s %2d m, %s %2d m, %s %3d m2",
                    meetingRoom.getName(), "szélessége", meetingRoom.getWidth(),
                    "hosszúsága", meetingRoom.getLength(), "területe", meetingRoom.getArea()));
            System.out.println(sb);
        }
    }

    public void printListOfNamesInLineWithLabel(List<MeetingRoom> meetingRooms, String label) {
        System.out.println(label);
        printListOfNamesInLine(meetingRooms);
    }

    public void printListOfNamesInLine(List<MeetingRoom> meetingRooms) {
        sb.delete(0, sb.length());
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

    public void printMeetingRoomWithLabel(MeetingRoom meetingRoom, String label) {
        System.out.println(label);
        printMeetingRoom(meetingRoom);
    }

    public void printMeetingRoom(MeetingRoom meetingRoom) {
        System.out.println(meetingRoom);
    }

    public void printMeetingRoomWithoutNameWithLabel(MeetingRoom meetingRoom, String label) {
        System.out.println(label);
        printMeetingRoomWithoutName(meetingRoom);
    }

    public void printMeetingRoomWithoutName(MeetingRoom meetingRoom) {
        System.out.println("szélesség: " + meetingRoom.getWidth()
                + ", hosszúság: " + meetingRoom.getLength()
                + ", terület: " + meetingRoom.getArea());
    }

    public void printDifferentStyleDependsOnSize(List<MeetingRoom> meetingRooms, String label) {
        if (meetingRooms.size() == 1) {
            printMeetingRoomWithoutNameWithLabel(meetingRooms.get(0), label);
        }
        if (meetingRooms.size() > 1) {
            printListOfMeetingRoomsWithLabel(meetingRooms, String.format(label));
        }
    }

    public boolean isStringValidInteger(String source) {
        String text = source.strip();
        for (int i = 0; i < text.length(); i++) {
            if (!Character.isDigit(text.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    private int getMaxWithOfNames(List<MeetingRoom> meetingRooms) {
        int maxWidth = 0;
        for (MeetingRoom meetingRoom : meetingRooms) {
            if (meetingRoom.getName().length() > maxWidth) {
                maxWidth = meetingRoom.getName().length();
            }
        }
        return maxWidth;
    }
}
