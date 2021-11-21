package introexceptionfinally;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NamesMain {

    public static void main(String[] args) {
        Names names = new Names();
        Path path = Paths.get("src/main/resources/introexceptionfinally/names.txt");
//        Path path = Paths.get("src/main/resources/introexceptionfinally/names2.txt");
//        Path path = Paths.get("src/main/resources/introexceptionfinally/names3.txt");

        names.getNameWithPrefixFromFile("dr", path);
    }
}
