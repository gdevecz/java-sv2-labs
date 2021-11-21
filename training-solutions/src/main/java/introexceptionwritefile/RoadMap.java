package introexceptionwritefile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class RoadMap {

    public static void main(String[] args) {
        List<String> cities = Arrays.asList("Szombathely","Sopron","Győr");
        try {
            Files.write(Paths.get("src/main/resources/introexceptionwritefile/roadmap.txt"), cities);
        }catch (IOException ioe) {
            System.out.println("Can not write file!");
            ioe.printStackTrace();
        }
    }
}
