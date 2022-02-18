package lambdaintermediate;

import java.util.List;
import java.util.Optional;

public class LongWords {

    private List<String> words;

    public LongWords(List<String> words) {
        this.words = words;
    }

    public long getNumberOfWordsStartWith(String keyWord) {
        return words.stream()
                .filter(w -> w.startsWith(keyWord))
                .count();
    }

    public List<String> getLongerWords(int number) {
        return words.stream()
                .filter(w -> number < w.length())
                .toList();
    }

    public Optional<String> getShortestWordContainingGivenCharacter(char character) {
        return words.stream()
                .filter(w -> w.contains(Character.toString(character)))
                .min((o1, o2) -> o1.length() - o2.length());
    }
}
