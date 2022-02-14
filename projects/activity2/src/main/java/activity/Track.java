package activity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Track {

    private static final String MISSING_TRACKPOINTS_MESSAGE = "Trackpoints is empty.";

    private List<TrackPoint> trackPoints = new ArrayList<>();

    public void loadFromGpx(InputStream gpxData) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(gpxData))) {
            fillTrackPoints(br);
        } catch (IOException ioe) {
            throw new IllegalArgumentException("File can not read.", ioe);
        }
    }

    public void addTrackPoint(TrackPoint trackPoint) {
        trackPoints.add(trackPoint);
    }

    public Coordinate findMaximumCoordinate() {
        double maxLatitude = trackPoints.stream()
                .mapToDouble(t -> t.getCoordinate().getLatitude())
                .max()
                .orElseThrow(() -> new IllegalStateException(MISSING_TRACKPOINTS_MESSAGE));
        double maxLongitude = trackPoints.stream()
                .mapToDouble(t -> t.getCoordinate().getLongitude())
                .max()
                .orElseThrow(() -> new IllegalStateException(MISSING_TRACKPOINTS_MESSAGE));
        return new Coordinate(maxLatitude, maxLongitude);
    }

    public Coordinate findMinimumCoordinate() {
        double maxLatitude = trackPoints.stream()
                .mapToDouble(t -> t.getCoordinate().getLatitude())
                .min()
                .orElseThrow(() -> new IllegalStateException(MISSING_TRACKPOINTS_MESSAGE));
        double maxLongitude = trackPoints.stream()
                .mapToDouble(t -> t.getCoordinate().getLongitude())
                .min()
                .orElseThrow(() -> new IllegalStateException(MISSING_TRACKPOINTS_MESSAGE));
        return new Coordinate(maxLatitude, maxLongitude);
    }

    public double getDistance() {
        TrackPoint before = trackPoints.get(0);
        double sum = 0.0;
        for (TrackPoint trackPoint : trackPoints) {
            sum += trackPoint.getDistanceFrom(before);
            before = trackPoint;
        }
        return sum;
    }

    public double getRectangleArea() {
        return (findMaximumCoordinate().getLatitude()- findMinimumCoordinate().getLatitude())
                * (findMaximumCoordinate().getLongitude()- findMinimumCoordinate().getLongitude());
    }

    public List<TrackPoint> getTrackPoints() {
        return trackPoints;
    }

    public double getFullElevation() {
        return listOfElevationDiffernces().stream()
                .mapToDouble(d -> d)
                .filter(d -> d > 0.0)
                .sum();
    }

    public double getFullDecrease() {
        return listOfElevationDiffernces().stream()
                .mapToDouble(d -> d)
                .filter(d -> d < 0.0)
                .sum() * -1.0;
    }

    private void fillTrackPoints(BufferedReader br) throws IOException{
        String line;
        while ((line = br.readLine()) != null) {
            if (line.strip().startsWith("<trkpt")) {
                String nextline =br.readLine();
                addTrackPoint(new TrackPoint(new Coordinate(
                        Double.parseDouble(line.substring(15, 25)),
                        Double.parseDouble(line.substring(32, 42))),
                        Double.parseDouble(nextline.substring(9, 14))
                ));
            }
        }
    }

    private List<Double> listOfElevationDiffernces() {
        TrackPoint before = trackPoints.get(0);
        List<Double> differences = new ArrayList<>();
        for (TrackPoint trackPoint : trackPoints) {
            differences.add(trackPoint.getElevation() - before.getElevation());
            before = trackPoint;
        }
        return differences;
    }
}
