package meetingroom1;

import java.util.Scanner;

public class MeetingRoomController {

    Office office = new Office();
    public static void main(String[] args) {

        MeetingRoomController mrc = new MeetingRoomController();
        mrc.runMenu();
    }

    public void runMenu(){
        Scanner sc = new Scanner(System.in);
        int option;
        do {
            printMenu();
            option = sc.nextInt();
            choosedOption(option);
        } while (option != 9);
    }

    public void printMenu() {
        System.out.println("1. Tárgyaló rögzítése\n"
                +"2. Tárgyalók sorrendben\n"
                +"3. Tárgyalók visszafele sorrendben\n"
                +"4. Minden második tárgyaló\n"
                +"5. Területek\n"
                +"6. Keresés pontos név alapján\n"
                +"7. Keresés névtöredék alapján\n"
                +"8. Keresés terület alapján\n"
                +"9. Kilépés");
    }

    private void choosedOption(int option) {
        Scanner sc = new Scanner(System.in);
        switch (option) {
            case 1 :
                String name;
                int width;
                int length;
                System.out.println("Kérem a tárgyaló adatait!");
                System.out.print("név: ");
                name = sc.nextLine();
                System.out.println("szélesség: ");
                width = sc.nextInt();
                System.out.println("hosszúság: ");
                length = sc.nextInt();
                sc.nextLine();
                office.addMeetingRoom(new MeetingRoom(name,length,width));
                break;
            case 2 :
                office.printNames();
                break;
            case 3:
                office.printNamesReverse();
                break;
            case 4:
                office.printEvenNames();
                break;
            case 5 :
                office.printAreas();
                break;
            case 6 :
                System.out.print("Kérem a keresendő tárgyaló nevét: ");
                String search = sc.nextLine();
                office.printMeetingRoomsWithName(search);
                break;
            case 7 :
                System.out.print("Kérem a mintát ami alapján keresek: ");
                String part = sc.nextLine();
                office.printMeetingRoomContains(part);
                break;
            case 8:
                System.out.println("Kérem a területet, aminél nagyobb tágyalókat keresek: ");
                int area = sc.nextInt();
                sc.nextLine();
                office.printAreasLargerThan(area);
                break;
        }
    }
}
