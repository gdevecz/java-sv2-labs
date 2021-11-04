package meetingroom;

import java.util.Scanner;

public class MeetingRoomController {

    Office office = new Office();
    MeetingRoomIO mIO = new MeetingRoomIO();

    public static void main(String[] args) {

        MeetingRoomController mrc = new MeetingRoomController();
        mrc.runMenu();
    }

    public void runMenu() {
        Scanner sc = new Scanner(System.in);
        office.addMeetingRoom(new MeetingRoom("teszt1", 3, 7));
        office.addMeetingRoom(new MeetingRoom("teSZt2", 3, 7));
        office.addMeetingRoom(new MeetingRoom("teszt3", 4, 4));
        office.addMeetingRoom(new MeetingRoom("teszt4", 2, 8));
        office.addMeetingRoom(new MeetingRoom("test1", 5, 5));
        int option;
        do {
            printMenu();
            option = mIO.labeledRequestANumber("Kérem válasszon menük közül: ");
            choosedOption(option);
        } while (option != 9);
    }

    public void printMenu() {
        mIO.printMenu();
    }

    private void choosedOption(int option) {
        Scanner sc = new Scanner(System.in);
        switch (option) {
            case 1:
                String label = "Kérem az új tárgyaló adatait!";
                office.addMeetingRoom(mIO.requestANeWMeetingRoom(label));
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
                String search = mIO.labeledRequestAName("Kérem a keresendő tárgyaló nevét: ");
                office.printMeetingRoomsFromName(search);
                break;
            case 7:
                String part = mIO.labeledRequestAName("Kérem a mintát ami alapján keresek: ");
                office.printMeetingRoomContains(part);
                break;
            case 8:
                int area = mIO.labeledRequestANumber("Kérem a területet, aminél nagyobb tágyalókat keresek: ");
                office.printAreasLargerThan(area);
                break;
        }
    }
}
