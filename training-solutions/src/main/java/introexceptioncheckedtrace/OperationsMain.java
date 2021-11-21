package introexceptioncheckedtrace;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;

public class OperationsMain {

    public static void main(String[] args) {
        Operations operations = new Operations();

        try {
            List<String> subwayTrains = operations.readFile("src/main/resources/introexceptioncheckedtrace/underground.txt");
            System.out.println(operations.getDailySchedule(subwayTrains));
        } catch (IOException e) {
            System.out.println("Can not read file!");
            e.printStackTrace();
        }
    }
}
