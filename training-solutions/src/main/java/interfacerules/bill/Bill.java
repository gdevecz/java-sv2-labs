package interfacerules.bill;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Bill {

    private List<String> bills = new ArrayList<>();

    public List<String> readBillItemsFromFile(Path path) {
        try {
            bills = Files.readAllLines(path);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file: " + path, ioe);
        }
        return bills;
    }
}
