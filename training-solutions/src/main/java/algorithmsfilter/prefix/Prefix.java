package algorithmsfilter.prefix;

import java.util.ArrayList;
import java.util.List;

public class Prefix {

    public List<String> getWordsStartWith(List<String> words, String prefix) {
        List<String> result = new ArrayList<>();
        for (String word : words) {
            if (word.startsWith(prefix)) {
                result.add(word);
            }
        }
        return result;
    }
}
