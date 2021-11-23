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
        if (patternIsNullOrBlank(pattern)
                || isListNull(words)
                || isWordsContainsNull(words)) {
            return false;
        }
        return true;
    }

    private boolean patternIsNullOrBlank(String text) {
        if (text == null) {
            throw new IllegalArgumentException("The string is null!");
        }
        if (text.isBlank()) {
            throw new IllegalArgumentException("The string is blank!");
        }
        return false;
    }

    private boolean isListNull(List<String> words) {
        return words == null;
    }

    private boolean isWordsContainsNull(List<String> words) {
        return words.contains(null);
    }
}
