package introexceptionwritefiletestjunit5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Electricity {

    public List<String> getListOfStreets(){
        List<String> result = new ArrayList<>();
        result.add(LocalDate.now().toString());
        result.add("Kossuth u.");
        result.add("Hegyalja u.");
        return result;
    }

    public void writeStreets(Path path) {
        List<String> streets = getListOfStreets();
        try {
            Files.write(path, streets);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not write file!", ioe);
        }
    }
}
