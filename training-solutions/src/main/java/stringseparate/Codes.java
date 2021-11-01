package stringseparate;

import java.util.List;

public class Codes {

    public String getCodesStartWithLetter(List<String> codes) {
        StringBuilder sb = new StringBuilder("Betűvel kezdődő kódok: ");
        Boolean start = true;
        for (int i = 0; i < codes.size(); i++) {
            if (Character.isAlphabetic(codes.get(i).charAt(0))) {
                if (!start) {
                    sb.append(", ");
                }
                start = false;
                sb.append(codes.get(i));
            }
        }
        return sb.toString();
    }
}
