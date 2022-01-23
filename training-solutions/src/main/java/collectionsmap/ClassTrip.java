package collectionsmap;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

public class ClassTrip {

    private Map<String, Integer> inpayments = new HashMap<>();

    public void loadInpayments(Path path) {
        try (BufferedReader bf = Files.newBufferedReader(path)) {
            String line;
            while ((line = bf.readLine()) != null) {
                String[] tmp = line.split(": ");
                inpayments.put(tmp[0], Integer.parseInt(tmp[1]));
            }
        } catch (IOException ioException) {
            throw new IllegalStateException("Can not read file.", ioException);
        }
    }

    public Map<String, Integer> getInpayments() {
        return inpayments;
    }
}
