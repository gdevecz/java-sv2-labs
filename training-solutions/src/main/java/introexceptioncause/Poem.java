package introexceptioncause;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Poem {

    public String firstLetters(String filename) {
        String result = null;
        try {
            List<String> rows = Files.readAllLines(Paths.get(filename));
            result = getFirstLetter(rows);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file!", ioe);
        }
        return result;
    }

    private String getFirstLetter(List<String> rows) {
        StringBuilder sb = new StringBuilder(rows.size());
        for (String row : rows) {
            sb.append(row.charAt(0));
        }
        return sb.toString();
    }
}
