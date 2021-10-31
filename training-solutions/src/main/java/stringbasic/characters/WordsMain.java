package stringbasic.characters;

import java.util.Scanner;

public class WordsMain {

    public static void main(String[] args) {
        Words words = new Words();
        Scanner sc = new Scanner(System.in);

        words.addTask();
        words.assignTheTask();

    }
}
