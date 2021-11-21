package introexceptionfinally;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Names {


    public void getNameWithPrefixFromFile(String prefix,Path path) {
        try {
            List<String> names = Files.readAllLines(path);
            System.out.println(getName(prefix, names));
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file!", ioe);
        } finally {
            System.out.println("End of reading.");
        }
    }

    private String getName(String prefix, List<String> names) {
        for (String name : names) {
            if (name.startsWith(prefix)) {
                return name;
            }
        }
        return "";
    }
}
