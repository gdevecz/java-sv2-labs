package chars;

public class Words {

    public String pushWord(String word) {
        String result = "";
        for (int i = 0; i < word.length(); i++) {
            result += (char) (word.charAt(i) + 1);
        }
        return result;
    }
}
