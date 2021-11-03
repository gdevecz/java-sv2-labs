package meetingroom2;

import java.util.Scanner;

public class MeetingRoomController {

    Office office = new Office();

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
            option = sc.nextInt();
            choosedOption(option);
        } while (option != 9);
    }

    public void printMenu() {
        System.out.println("1. Tárgyaló rögzítése\n"
                + "2. Tárgyalók sorrendben\n"
                + "3. Tárgyalók visszafele sorrendben\n"
                + "4. Minden második tárgyaló\n"
                + "5. Területek\n"
                + "6. Keresés pontos név alapján\n"
                + "7. Keresés névtöredék alapján\n"
                + "8. Keresés terület alapján\n"
                + "9. Kilépés");
    }

    private void choosedOption(int option) {
        Scanner sc = new Scanner(System.in);
        switch (option) {
            case 1:
                System.out.println("Kérem a tárgyaló adatait!");
                String name = labeledRequestAName("név: ");
                int width = labeledRequestANumber("szélesség: ");
                int length = labeledRequestANumber("hosszúság: ");
                office.addMeetingRoom(new MeetingRoom(name, length, width));
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
                String search = labeledRequestAName("Kérem a keresendő tárgyaló nevét: ");
                office.printMeetingRoomsWithName(search);
                break;
            case 7:
                String part = labeledRequestAName("Kérem a mintát ami alapján keresek: ");
                office.printMeetingRoomContains(part);
                break;
            case 8:
                int area = labeledRequestANumber("Kérem a területet, aminél nagyobb tágyalókat keresek: ");
                office.printAreasLargerThan(area);
                break;
        }
    }

    private String labeledRequestAName(String label) {
        Scanner sc = new Scanner(System.in);
        System.out.print(label);
        return sc.nextLine();
    }

    private int labeledRequestANumber(String label) {
        Scanner sc = new Scanner(System.in);
        System.out.print(label);
        return sc.nextInt();
    }
}