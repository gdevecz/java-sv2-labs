package introexceptioncheckedtrace;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.List;

public class Operations {

    public List<String> readFile(String fileName) throws IOException {
        return Files.readAllLines(Paths.get(fileName));
    }

    public String getDailySchedule(List<String> dailyDatas) {
        StringBuilder sb = new StringBuilder(LocalDate.now().toString()).append(",");
        for (String metroID : dailyDatas) {
            if (metroID.startsWith("2")) {
                sb.append(" ").append(metroID);
            }
        }
        return sb.toString();
    }
}
