package introexceptionreadfiletestjunit4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Words {

    public String getFirstWordWithA(Path path) {
            List<String> rows = loadWords(path);
            return getFirstWordStartA(rows);
    }

    private String getFirstWordStartA(List<String> rows) {
        for (int i = 0; i < rows.size(); i++) {
            if (rows.get(i).charAt(0) == 'A') {
                return rows.get(i);
            }
        }
        return "A";
    }

    private List<String> loadWords(Path path) {
        try {
            return Files.readAllLines(path);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file!");
        }
    }
}
