package meetingroom;

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
        return result;
    }

    public int labeledRequestANumber(String label) {
        String numberString;
        Scanner sc = new Scanner(System.in);

        System.out.print(label);
        while (!isStringValidInteger(numberString = sc.nextLine())) {
            System.out.print("A megadott adat nem szám, kérem adja meg újra!\n" + label);
        }
        return Integer.parseInt(numberString.strip());
    }

    public MeetingRoom requestANewMeetingRoom(String label) {
        System.out.println(label);
        String name = labeledRequestAString("      név: ");
        int width = labeledRequestANumber("szélesség: ");
        int length = labeledRequestANumber("hosszúság: ");
        return new MeetingRoom(name, length, width);
    }

    public void printLabeledListOfNames(List<MeetingRoom> meetingRooms, String label) {
        System.out.println(label);
        printListOfNames(meetingRooms);
    }

    public void printListOfNames(List<MeetingRoom> meetingRooms) {
        boolean first = true;

        for (MeetingRoom meetingRoom : meetingRooms) {
            if(first) {
                first=false;
            }else {
                System.out.print(",\n");
            }
            System.out.print(meetingRoom.getName());
        }
        System.out.println();
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

    public void printMeetingRoomButName(MeetingRoom meetingRoom) {
        System.out.printf("%s %3d m, %s %3d m, %s %4d m\u00B2\n",
                "szélessége", meetingRoom.getWidth(),
                "hosszúsága", meetingRoom.getLength(),
                "területe", meetingRoom.getArea());
    }

    public void printLabeledListOfMeetingRooms(List<MeetingRoom> meetingRooms, String label) {
        System.out.println(label);
        printListOfOMeetingRooms(meetingRooms);
    }

    public void printListOfOMeetingRooms(List<MeetingRoom> meetingRooms) {
        int maxWidthOfNames = getMaxWithOfNames(meetingRooms);
        String pattern = "%" + maxWidthOfNames + "s %s %3d m, %s %3d m, %s %4d m\u00B2\n";

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
        boolean first = true;
        for (MeetingRoom meetingRoom : meetingRooms) {
            if (first) {
                first = false;
            } else {
                System.out.print(", ");
            }
            System.out.print(meetingRoom.getName());
        }
        System.out.println();
    }

    public void messageToConsole(String message) {
        System.out.println(message);
    }

    public boolean yesNoQuestion(String label) {
        String yesString = "i";
        String noString = "n";
        System.out.print(label + " (" + yesString + "/" + noString + ") ");
        String answer;
        Scanner sc = new Scanner(System.in);

        while (!((answer = sc.nextLine()).equalsIgnoreCase(yesString)
                || answer.equalsIgnoreCase(noString))) {
            System.out.println("Hibás adat! Kérem adja meg helyesen!\n" + label);
        }
        return answer.equalsIgnoreCase(yesString);
    }

    public void waitForEnter() {
        System.out.print("Tovább: ENTER");
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
    }

    private boolean isStringValidInteger(String source) {
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
}