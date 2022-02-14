package activity;

public class TrackPoint {

    public static final double RADIUS_OF_THE_EARTH = 6_371_000.0;

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

    public double getDistanceFrom(TrackPoint trackPoint) {
        double latitudeDistance =
                Math.toRadians(trackPoint.coordinate.getLatitude() - coordinate.getLatitude());
        double longitudeDistance =
                Math.toRadians(trackPoint.coordinate.getLongitude() - coordinate.getLongitude());
        double thisLatitudeInRadian =
                Math.toRadians(this.coordinate.getLatitude());
        double otherLatitudeInRadian = Math.toRadians(trackPoint.coordinate.getLatitude());
        double a = Math.pow(Math.sin(latitudeDistance / 2), 2)
                + Math.cos(thisLatitudeInRadian) * Math.cos(otherLatitudeInRadian)
                * Math.pow(Math.sin(longitudeDistance / 2), 2);
        double c = 2 * Math.asin(Math.sqrt(a));
        double differenceOfElevation = elevation - trackPoint.elevation;
        return Math.sqrt(Math.pow(RADIUS_OF_THE_EARTH * c, 2) + Math.pow(differenceOfElevation, 2));
    }
}
