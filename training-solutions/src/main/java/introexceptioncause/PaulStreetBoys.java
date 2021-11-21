package introexceptioncause;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class PaulStreetBoys {

    public List<String> readNames(String fileName) {
        List<String> result = null;
        try {
            result = Files.readAllLines(Paths.get(fileName));
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file!", ioe);
        }
        return result;
    }

    public void printNames(List<String> names) {
        for (String name : names) {
            if (name.toLowerCase().startsWith("nemecsek ")) {
                System.out.println(name.toLowerCase());
            } else {
                System.out.println(name);
            }
        }
    }
}
