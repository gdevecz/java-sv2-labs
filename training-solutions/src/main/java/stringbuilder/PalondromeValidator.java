package stringbuilder;

import java.util.Locale;

public class PalondromeValidator {

    public boolean isPalindrome(String word) {
        StringBuilder sb = new StringBuilder(word.strip());
        return word.strip().equalsIgnoreCase(sb.reverse().toString());
    }
}
