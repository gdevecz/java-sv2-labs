package exceptionmulticatch.aid;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Aid {

    private int amount;

    public Aid(int amount) {
        this.amount = amount;
    }

    public List<String> countAmountsOfAid(Path path) {
        List<String> lines = null;
        List<String> result = new ArrayList<>();
        try {
            lines = Files.readAllLines(path);
            for (String str : lines) {
                String[] data = str.split(": ");
                result.add(data[0] + ": " + amount / Integer.parseInt(data[1]));
            }
        } catch (IOException | NullPointerException | IndexOutOfBoundsException | NumberFormatException | ArithmeticException e) {
            throw new IllegalStateException("Something went wrong while counting.", e);
        }
        return result;
    }
}
