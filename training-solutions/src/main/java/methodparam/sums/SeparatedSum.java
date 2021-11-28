package methodparam.sums;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class SeparatedSum {

    public SumsOfPositivesAndNegatives sum(Path path) {
        try {
            return getSumsOfPositivesAndNegatives(path);
        } catch (IOException ioe) {
            throw new IllegalArgumentException("Can not read: " + path, ioe);
        }
    }

    private SumsOfPositivesAndNegatives getSumsOfPositivesAndNegatives(Path path) throws IOException {
        List<String> rows = Files.readAllLines(path);
        List<Double> numbers = getNumberFromStrings(rows);
        return getSums(numbers);
    }

    private List<Double> getNumberFromStrings(List<String> rows) {
        List<Double> result = new ArrayList<>();
        for (String s : rows) {
            result.addAll(getNumbersFromRow(s));
        }
        return result;
    }

    private List<Double> getNumbersFromRow(String row) {
        List<Double> result = new ArrayList<>();
        String[] tmp = row.replace(',', '.').split(";");
        for (String s : tmp) {
            result.add(Double.parseDouble(s));
        }
        return result;
    }

    private SumsOfPositivesAndNegatives getSums(List<Double> numbers) {
        double sumOfPositives = 0.0;
        double sumOfNegatives = 0.0;
        for (double d : numbers) {
            if (d > 0.0) {
                sumOfPositives += d;
            } else {
                sumOfNegatives += d;
            }
        }
        return new SumsOfPositivesAndNegatives(sumOfPositives, sumOfNegatives);
    }
}
