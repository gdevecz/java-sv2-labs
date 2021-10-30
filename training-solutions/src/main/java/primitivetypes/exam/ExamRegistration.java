package primitivetypes.exam;

import java.util.Arrays;
import java.util.Scanner;

public class ExamRegistration {

    public static void main(String[] args) {

        Exam exam = new Exam();
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérem az jelentkezők adatait, kilépés üres sor (Enter)");
        System.out.println("Az adatok megadási módja:\nnév, születési idő(yyyy.mm.dd), irányítószám, tanulmányi átlag");
        System.out.println("Examlple: John Doe, 1995.10.3, 1089, 4,3");

        String data;
        Person person;
        //data = "Netuddky, 2011.03.24, 8900, 2,3";
        for (int i = 1; !(data = sc.nextLine()).equals(""); i++) {
            if (!exam.isValidStringForPerson(data)) {
                System.out.println("Hibás adat, nincs felvezetve.");
            } else {
                exam.addPerson(exam.personFromString(data));
            }
        }
        System.out.println(exam.getPersons().size());
        System.out.println(Arrays.deepToString(exam.getPersons().toArray()));
    }
}
