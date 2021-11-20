package introexceptionthrow;

import java.util.Scanner;

public class ShortWord {

    public static void main(String[] args) {
        System.out.print("Kérem a max. 5 karakteres szót: ");
        Scanner sc = new Scanner(System.in);
        String shortWord = sc.nextLine();
        if (shortWord.length() > 5) {
            throw new IllegalArgumentException("The input is longer than 5 character");
        } else {
            int i = 0;
            while (i < shortWord.length() && Character.isAlphabetic(shortWord.charAt(i++)))
                ;
            if (i != shortWord.length()) {
                throw new IllegalArgumentException("The input is not just letters!");
            } else {
                System.out.println("A rövid szó: " + shortWord);
            }
        }
    }
}
