package exceptionresource.siblings;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Siblings {

    public List<String> getFullNames(String lastName, Path path) {
        List<String> result = new ArrayList<>();
        try (Scanner sc = new Scanner(path)) {
            while (sc.hasNextLine()) {
                result.add(lastName + " " + sc.nextLine());
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("File can not read.", ioe);
        }
        return result;
    }
}
