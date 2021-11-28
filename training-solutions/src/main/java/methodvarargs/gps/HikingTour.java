package methodvarargs.gps;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class HikingTour {

    List<FieldPoint> fieldPoints = new ArrayList<>();

    public void logFieldPoints(LocalDateTime timeOfLogging, FieldPoint... fieldPointsToLog) {
        for (FieldPoint fp : fieldPointsToLog) {
            fp.setTimeOfLogging(timeOfLogging);
            fieldPoints.add(fp);
        }
    }
}
