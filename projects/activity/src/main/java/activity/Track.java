package activity;

import java.util.ArrayList;
import java.util.List;

public class Track {

    private List<TrackPoint> trackPoints = new ArrayList<>();

    public void addTrackPoint(TrackPoint trackPoint) {
        trackPoints.add(trackPoint);
    }

    public Coordinate findMaximumCoordinate() {
        double maxLatitude = trackPoints.stream()
                .mapToDouble(t -> t.getCoordinate().getLatitude())
                .max()
                .orElseThrow(() -> new IllegalStateException("Trackpoints is empty."));
        double maxLongitude = trackPoints.stream()
                .mapToDouble(t -> t.getCoordinate().getLongitude())
                .max()
                .orElseThrow(() -> new IllegalStateException("Trackpoints is empty."));
        return new Coordinate(maxLatitude, maxLongitude);
    }

    public Coordinate findMinimumCoordinate() {
        double maxLatitude = trackPoints.stream()
                .mapToDouble(t -> t.getCoordinate().getLatitude())
                .min()
                .orElseThrow(() -> new IllegalStateException("Trackpoints is empty."));
        double maxLongitude = trackPoints.stream()
                .mapToDouble(t -> t.getCoordinate().getLongitude())
                .min()
                .orElseThrow(() -> new IllegalStateException("Trackpoints is empty."));
        return new Coordinate(maxLatitude, maxLongitude);
    }

    public double getDistance() {
        TrackPoint before = new TrackPoint(new Coordinate(0, 0), 0);
        double sum = 0.0;
        for (TrackPoint trackPoint : trackPoints) {
            sum += trackPoint.getDistanceFrom(before);
            before = trackPoint;
        }
        return sum;
    }

    public double getRectangleArea() {
        return findMaximumCoordinate().getLatitude()- findMinimumCoordinate().getLatitude()
                * findMaximumCoordinate().getLongitude()- findMinimumCoordinate().getLongitude();
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

    private List<Double> listOfElevationDiffernces() {
        TrackPoint before = new TrackPoint(new Coordinate(0, 0), 0);
        List<Double> differences = new ArrayList<>();
        for (TrackPoint trackPoint : trackPoints) {
            differences.add(trackPoint.getElevation() - before.getElevation());
            before = trackPoint;
        }
        return differences;
    }
}
