package junit5fixture;

import java.util.ArrayList;
import java.util.List;

public class Words {

    private List<String> words = new ArrayList<>();

    public void addWord(String word) {
        words.add(word);
    }

    public void getWordsStartWith(String prefix) {
        List<String> removableWords = new ArrayList<>();
        for ( String word : words) {
            if(!word.startsWith(prefix)) {
                removableWords.add(word);
            }
        }
        words.removeAll(removableWords);
    }

    public void getWordsWithLength(int length) {
        List<String> removableWords = new ArrayList<>();
        for ( String word : words) {
            if(word.length() != length) {
                removableWords.add(word);
            }
        }
        words.removeAll(removableWords);
    }

    public List<String> getWords() {
        return words;
    }
}
