package meetingroom;

import java.util.Scanner;

public class MeetingRoomController {

    private Office office = new Office();

    private MeetingRoomIO mIO = new MeetingRoomIO();


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

    public void loadTestOffice() {
        office.addMeetingRoom(new MeetingRoom("teszt1 tárgyaló", 7, 3));
        office.addMeetingRoom(new MeetingRoom("ez egy teszt tárgyaló", 5, 4));
        office.addMeetingRoom(new MeetingRoom("teSZt2", 13, 7));
        office.addMeetingRoom(new MeetingRoom("teszt3", 41, 19));
        office.addMeetingRoom(new MeetingRoom("a meeting room", 41, 20));
        office.addMeetingRoom(new MeetingRoom("kiselőadó", 20, 18));
        office.addMeetingRoom(new MeetingRoom("test1", 5, 5));
        office.addMeetingRoom(new MeetingRoom("testMeetingRoom", 25, 25));
        office.addMeetingRoom(new MeetingRoom("teszt3", 5, 2));
        office.addMeetingRoom(new MeetingRoom("nagyelőadó", 47, 21));

        mIO.printLabeledListMeetingRooms(
                office.getMeetingRooms(),
                "A program a test agrumentummal a következő tesztesetekkel indul:");
        mIO.waitForEnter();
    }

    private void chosenOption(int option) {
        Scanner sc = new Scanner(System.in);
        switch (option) {
            case 1:
                MeetingRoom newMeetingRoom = mIO.requestANewMeetingRoom("Kérem az új tárgyaló adatait!");
                if (checkNameBeforeAdd(newMeetingRoom)) {
                    office.addMeetingRoom(newMeetingRoom);
                    mIO.messageToConsole(newMeetingRoom.getName() + " nevű tárgyaló felvéve a listába.");
                    mIO.waitForEnter();
                }
                break;
            case 2:
                office.printNames();
                mIO.waitForEnter();
                break;
            case 3:
                office.printNamesReverse();
                mIO.waitForEnter();
                break;
            case 4:
                office.printEvenNames();
                mIO.waitForEnter();
                break;
            case 5:
                office.printAreas();
                mIO.waitForEnter();
                break;
            case 6:
                String search = mIO.labeledRequestAString("Kérem a keresendő tárgyaló nevét: ");
                office.printMeetingRoomsFromName(search);
                mIO.waitForEnter();
                break;
            case 7:
                String part = mIO.labeledRequestAString("Kérem a mintát ami alapján keresek: ");
                office.printMeetingRoomContains(part);
                mIO.waitForEnter();
                break;
            case 8:
                int area = mIO.labeledRequestANumber("Kérem a területet, aminél nagyobb tágyalókat keresek: ");
                office.printAreasLargerThan(area);
                mIO.waitForEnter();
                break;
        }
    }

    private boolean checkNameBeforeAdd(MeetingRoom newMeetingRoom) {
        if (office.checkNameInList(newMeetingRoom.getName())) {
            String label = newMeetingRoom.getName() + " nevű tárgyaló már szerepel, biztos hogy felvegyem a listába?";
            return mIO.yesNoQuestion(label);
        }
        return true;
    }

    private boolean isProcessOption(int option) {
        if (option > 1 && option != 6 && option < 9) {
            if (office.checkEmptyList()) {
                mIO.messageToConsole("A tárgyalók listája üres!");
                return false;
            }
        }
        return true;
    }
}
