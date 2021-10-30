package chars;

public class Whitespace {

    public String makeWhitespaceToStar(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            if ( Character.isWhitespace(text.charAt(i))) {
                result += '*';
            } else result += text.charAt(i);
        }
        return result;
    }
}
