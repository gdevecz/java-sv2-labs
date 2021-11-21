package introexceptioncause;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TrackPoints {

    private List<TrackingPoint> trackingPoints = new ArrayList<>();

    public void loadTrackingPoints(String fileName) {
        try {
            List<String> rows = Files.readAllLines(Paths.get(fileName));
            setTrackingPoints(rows);
        } catch (IOException e) {
            throw new IllegalStateException("Can not read file!");
        }
    }

    public void printLevelDifferences() {
        for (int i = 0; i < trackingPoints.size() - 1; i++) {
            printLevelDifference(trackingPoints.get(i), trackingPoints.get(i + 1));
        }
    }

    private void setTrackingPoints(List<String> rows) {
        for (String row : rows) {
            String[] data = row.split(";");
            trackingPoints.add(
                    new TrackingPoint(
                            Double.parseDouble(data[0]),
                            Double.parseDouble(data[1]),
                            Integer.parseInt(data[2])
                    )
            );
        }
    }

    private void printLevelDifference(TrackingPoint start, TrackingPoint end) {
        System.out.println(end.getLevel() - start.getLevel());
    }

}
