package meetingroom4;

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

    public String labeledRequestAString(String label) {
        System.out.print(label);
        Scanner sc = new Scanner(System.in);

        String result = sc.nextLine();
        sc.close();
        return result;
    }

    public int labeledRequestANumber(String label) {
        String numberString;
        Scanner sc = new Scanner(System.in);

        System.out.print(label);
        sc.nextLine();
        while (!isStringValidInteger(numberString = sc.nextLine())) {
            System.out.print("A megadott adat nem szám, kérem adja meg újra!\n" + label);
        }
        sc.close();
        return Integer.parseInt(numberString.strip());
    }

    public MeetingRoom requestANewMeetingRoom(String label) {
        System.out.println(label);
        String name = labeledRequestAString("      név: ");
        int width = labeledRequestANumber("szélesség: ");
        int length = labeledRequestANumber("hosszúság: ");
        return new MeetingRoom(name, length, width);
    }

    public void printLabeledListOfMeetingRoomsButName(List<MeetingRoom> meetingRooms, String label) {
        System.out.println(label);
        printListOfMeetingRoomsButName(meetingRooms);
    }

    public void printListOfMeetingRoomsButName(List<MeetingRoom> meetingRooms) {
        for (MeetingRoom meetingRoom : meetingRooms) {
            printMeetingRoomButName(meetingRoom);
        }
    }

    public void printLabeledListOfMeetingRooms(List<MeetingRoom> meetingRooms, String label) {
        System.out.println(label);
        printListOfOMeetingRooms(meetingRooms);
    }

    public void printListOfOMeetingRooms(List<MeetingRoom> meetingRooms) {
        int maxWidthOfNames = getMaxWithOfNames(meetingRooms);
        String pattern = "%" + maxWidthOfNames + "s %s %2d m, %s %2d m, %s %3d m\u00B2\n";

        for (MeetingRoom meetingRoom : meetingRooms) {
            System.out.printf(pattern, meetingRoom.getName(), "szélessége", meetingRoom.getWidth(),
                    "hosszúsága", meetingRoom.getLength(), "területe", meetingRoom.getArea());
        }
    }

    public void printLabeledNamesInLine(List<MeetingRoom> meetingRooms, String label) {
        System.out.println(label);
        printNamesInLine(meetingRooms);
    }

    public void printNamesInLine(List<MeetingRoom> meetingRooms) {
        StringBuilder sb = new StringBuilder();

        for (MeetingRoom meetingRoom : meetingRooms) {
            if (!sb.isEmpty()) {
                if(sb.length()!=0 && ((sb.length()+meetingRoom.getName().length()) < 20)){
                    System.out.print(", ");
                } else
                    System.out.println("\n");
            }
            System.out.print(meetingRoom.getName());
        }
        System.out.println();
    }

    public void printLabeledMeetingRoom(MeetingRoom meetingRoom, String label) {
        System.out.println(label);
        printMeetingRoom(meetingRoom);
    }

    public void printMeetingRoom(MeetingRoom meetingRoom) {
        System.out.println(meetingRoom);
    }

    public void printLabeledMeetingRoomButName(MeetingRoom meetingRoom, String label) {
        System.out.println(label);
        printMeetingRoomButName(meetingRoom);
    }

    public void printMeetingRoomButName(MeetingRoom meetingRoom) {
        System.out.printf("%s %3d m, %s %3d m, %s %4d m\u00B2\n",
                "szélessége", meetingRoom.getWidth(),
                "hosszúsága", meetingRoom.getLength(),
                "területe", meetingRoom.getArea());
    }

    public boolean yesNoQuestion(String label) {
        String yesString = "i";
        String noString = "n";
        System.out.print(label + " (" + yesString + "/" + noString + ")");
        String answer;
        Scanner sc = new Scanner(System.in);

        while (!((answer = sc.nextLine()).equalsIgnoreCase(yesString)
                || answer.equalsIgnoreCase(noString))) {
            System.out.println("Hibás adat! Kérem adja meg helyesen!");
            System.out.print(label);
        }
        sc.close();
        return answer.equals(yesString);
    }

    public boolean isStringValidInteger(String source) {
        if (source.isBlank()) {
            return false;
        }

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

    public void messageToConsole(String message) {
        System.out.println(message);
    }
}
