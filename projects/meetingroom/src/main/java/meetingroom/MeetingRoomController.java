package meetingroom;

import java.util.Scanner;

public class MeetingRoomController {

    Office office = new Office();
    MeetingRoomIO mIO = new MeetingRoomIO();


    public void runMenu() {
        int option;
        do {
            printMenu();
            option = mIO.labeledRequestANumber("Kérem válasszon a menük közül: ");
            if (!isProcessOption(option)) {
                continue;
            }
            chosenOption(option);
        } while (option != 9);
    }

    public void printMenu() {
        mIO.printMenu();
    }

    private void chosenOption(int option) {
        Scanner sc = new Scanner(System.in);
        switch (option) {
            case 1:
                String label = "Kérem az új tárgyaló adatait!";
                MeetingRoom newMeetingRoom = mIO.requestANewMeetingRoom(label);
                System.out.println(checkNameBeforeAdd(newMeetingRoom));
                if (office.getMeetingRooms().isEmpty() || checkNameBeforeAdd(newMeetingRoom)) {
                    office.addMeetingRoom(newMeetingRoom);
                }
                break;
            case 2:
                office.printNames();
                break;
            case 3:
                office.printNamesReverse();
                break;
            case 4:
                office.printEvenNames();
                break;
            case 5:
                office.printAreas();
                break;
            case 6:
                String search = mIO.labeledRequestAString("Kérem a keresendő tárgyaló nevét: ");
                office.printMeetingRoomsFromName(search);
                break;
            case 7:
                String part = mIO.labeledRequestAString("Kérem a mintát ami alapján keresek: ");
                office.printMeetingRoomContains(part);
                break;
            case 8:
                int area = mIO.labeledRequestANumber("Kérem a területet, aminél nagyobb tágyalókat keresek: ");
                office.printAreasLargerThan(area);
                break;
        }
    }

    private boolean checkNameBeforeAdd(MeetingRoom newMeetingRoom) {
        if (office.checkNameInList(newMeetingRoom.getName())) {
            String label = "Ilyen nevű tárgyaló már szerepel, biztos hogy felvegyem a listába?";
            if (mIO.yesNoQuestion(label)) {
                return true;
            }
        }
        return false;
    }

    private boolean isProcessOption(int option) {
        if (option > 1 && option != 6 && option < 9) {
            if (office.checkEmptyList()) {
                mIO.messageToConsole("A lista üres!");
                return false;
            }
        }
        return true;
    }
}
