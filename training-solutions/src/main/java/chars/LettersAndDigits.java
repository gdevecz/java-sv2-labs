package chars;

import jdk.swing.interop.SwingInterOpUtils;

public class LettersAndDigits {

    public void printLetterOrDigit(String text) {
        for (int i = 0; i < text.length(); i++) {
            if (Character.isAlphabetic(text.charAt(i))) {
                System.out.println(text.charAt(i) + " : betű");
            } else if (Character.isDigit(text.charAt(i))) {
                System.out.println(text.charAt(i) + " : számjegy");
            } else {
                System.out.println(text.charAt(i) + " : egyéb");
            }
        }
    }
}