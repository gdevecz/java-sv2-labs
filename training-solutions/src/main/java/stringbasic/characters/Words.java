package stringbasic.characters;

import java.util.Scanner;

public class Words {

    private String word;

    public void addTask(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Kérem a feladat szavát: ");
        word = sc.nextLine();
    }

    public boolean assignTheTask() {
        String result = giveTaskToStudent();
        return validatingStudentWork(result);
    }

    private String giveTaskToStudent(){
        Scanner sc = new Scanner(System.in);
        System.out.println("A következő szót kell egyenként, betűnkét beírnod(betű+ENTER): " + word);
        StringBuffer sb = new StringBuffer(word.length());
        for (int i = 0; i < word.length(); i++) {
            sb.append(sc.nextLine());
        }
        return sb.toString();
    }

    private boolean validatingStudentWork(String typedWord) {
        System.out.println("    A feladat szava: " + word);
        System.out.println("A feladat megoldása: " + typedWord);
        if(word.equals(typedWord)) {
            System.out.println("Gratulálok, jól oldottad meg a feladatot.");
            return true;
        }
        System.out.println("Sajnos, nem sikerült a feladatot teljesítened.");
        return false;
    }
}
