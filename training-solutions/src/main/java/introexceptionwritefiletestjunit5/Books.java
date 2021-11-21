package introexceptionwritefiletestjunit5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Books {

    public void rewriteFile(Path sourceFile, Path targetFile) {
        List<String> source = getLinesFromFile(sourceFile);
        List<String> target = getTargetFromSource(source);
        writeTarget(target, targetFile);
    }

    private void writeTarget(List<String> target, Path path) {
        try {
            Files.write(path, target);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not write file!", ioe);
        }
    }

    private List<String> getLinesFromFile(Path path) {
        try {
            return Files.readAllLines(path);
        } catch (IOException ioe) {
            throw new IllegalArgumentException("Can not read file!", ioe);
        }
    }

    private List<String> getTargetFromSource(List<String> source) {
        List<String> target = new ArrayList<>();
        for (String row : source) {
            String[] tmp = row.split(";");
            target.add(tmp[2] + ": " + tmp[1]);
        }
        return target;
    }
}
