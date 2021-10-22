package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Crossword {

    public static void main(String[] args) {

        List<String> puzzle = new ArrayList<>(Arrays.asList("KULCS", "KÁLYHA", "LÓ", "AJTÓ", "CSERESZNYEFA", "TEJ",
                "FELHŐ", "CIPŐ", "MOSODA", "KÁVÉTEJSZÍN", "CITERA", "BABA"));

        for (String word : puzzle) {
            if (word.length() == 6) {
                System.out.println(word);
            }
        }

        List<String> sixCharacterWords = new ArrayList<>();
        for (String word : puzzle) {
            if (word.length() == 6) {
                sixCharacterWords.add(word);
            }
        }
        System.out.println(sixCharacterWords);
    }
}
