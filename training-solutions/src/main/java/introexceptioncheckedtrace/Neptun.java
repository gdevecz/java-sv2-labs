package introexceptioncheckedtrace;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Neptun {

    public List<String> readNetpunCodes(String filename) throws IOException {
        return Files.readAllLines(Paths.get(filename));
    }
}
