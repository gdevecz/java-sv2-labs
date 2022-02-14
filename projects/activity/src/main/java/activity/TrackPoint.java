package activity;

public class TrackPoint {

    private static final double RADIUS_OF_EARTH = 6371.01;

    private Coordinate coordinate;

    private double elevation;

    public TrackPoint(Coordinate coordinate, double elevation) {
        this.coordinate = coordinate;
        this.elevation = elevation;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public double getElevation() {
        return elevation;
    }

    public double getDistanceFrom(TrackPoint other) {
        double latDistance = Math.toRadians(other.getCoordinate().getLatitude() - coordinate.getLatitude());
        double lonDistance = Math.toRadians(other.getCoordinate().getLongitude() - coordinate.getLongitude());

        double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2)
                + Math.cos(Math.toRadians(coordinate.getLatitude()) * Math.cos(Math.toRadians(other.getCoordinate().getLatitude())))
                * Math.sin(lonDistance / 2) * Math.sin(lonDistance / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        double distance = RADIUS_OF_EARTH * c * 1000.0;
        double height =  elevation - other.getElevation();

        distance = Math.pow(distance, 2) + Math.pow(height, 2);

        return Math.sqrt(distance);
    }
}
