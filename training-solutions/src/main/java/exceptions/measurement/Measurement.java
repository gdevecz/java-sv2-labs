package exceptions.measurement;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Measurement {

    public List<String> readFromFile(Path path) {
        List<String> result;
        try {
            result = Files.readAllLines(path);
        } catch (IOException ioException) {
            throw new IllegalStateException("File can not read: " + path);
        }
        return result;
    }

    public List<String> validate(List<String> lines) {
        List<String> result = new ArrayList<>();
        for (String line : lines) {
            if (!validateLine(line.split(","))) {
                result.add(line);
            }
        }
        return result;
    }

    private boolean validateLine(String[] lineData) {
        return validateNumberOfData(lineData)
                && validateNumberOfLine(lineData[0])
                && validateMeasurement(lineData[1])
                && validateName(lineData[2]);
    }

    private boolean validateNumberOfData(String[] lineData) {
        return lineData.length == 3;
    }

    private boolean validateNumberOfLine(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException numberFormatException) {
            return false;
        }
    }

    private boolean validateMeasurement(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException numberFormatException) {
            return false;
        }
    }

    private boolean validateName(String str) {
        return str.contains(" ");
    }
}
