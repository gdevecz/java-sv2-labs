package introexceptionreadfile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Shopping {

    public static void main(String[] args) {
        try {
            List<String> items = Files.readAllLines(Paths.get("src/main/resources/introexceptionreadfile/shoppinglist.txt"));
            System.out.println(items);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
