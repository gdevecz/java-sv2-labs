package controlselection.consonant;

import java.util.Arrays;
import java.util.List;

public class ToConsonant {
    private List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');

    public char notASinglevowel(char c) {
        if(vowels.contains(c)) {
            return (char) (c + 1);
        }
        return c;
    }
}
