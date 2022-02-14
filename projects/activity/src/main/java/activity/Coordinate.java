package activity;

public class Coordinate {

    private static final double MIM_LATITUDE = -90.0;
    private static final double MAX_LATITUDE = 90.0;
    private static final double MIN_LONGITUDE = -180.0;
    private static final double MAX_LONGITUDE = 180.0;

    private double latitude;

    private double longitude;

    public Coordinate(double latitude, double longitude) {
        if (latitude < MIM_LATITUDE || latitude > MAX_LATITUDE) {
            throw new IllegalArgumentException("Latitude is invalid (-90, 90): " + latitude);
        }
        if (longitude < MIN_LONGITUDE || longitude > MAX_LONGITUDE) {
            throw new IllegalArgumentException("Longitude is invalid (-180, 180): " + longitude);
        }
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public double getDistance(Coordinate other) {



        double latitudeDistance = other.latitude - latitude;
        double longitudeDistance = other.longitude - longitude;
        return Math.sqrt(Math.pow(latitudeDistance,2)+Math.pow(longitudeDistance,2));
    }
}
