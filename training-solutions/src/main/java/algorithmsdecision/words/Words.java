package algorithmsdecision.words;

import java.util.List;

public class Words {

    public boolean containsLongerWord(List<String> words, String pattern) {
        if (!inputValidator(words, pattern)) {
            return isLongerWordThenPattern(words, pattern);
        }
        return false;
    }

    private boolean isLongerWordThenPattern(List<String> words, String pattern) {
        for (String word : words) {
            if (word.length() > pattern.length()) {
                return true;
            }
        }
        return false;
    }

    private boolean inputValidator(List<String> words, String pattern) {
        if (words == null) {
            throw new IllegalArgumentException("The list is null!");
        }
        if (pattern == null || words.contains(null)) {
            throw new IllegalArgumentException("The string is null!");
        }
        if (pattern.isBlank()) {
            throw new IllegalArgumentException("The string is blank!");
        }
        return true;
    }
}
