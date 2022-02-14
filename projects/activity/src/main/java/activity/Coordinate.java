package activity;

public class Coordinate {

    private double latitude;
    private double longitude;

    public Coordinate(double latitude, double longitude) {
        if (coordinateValidator(latitude, longitude)) {
            this.latitude = latitude;
            this.longitude = longitude;
        } else {
            throw new IllegalArgumentException("Latitude(-180.0, 180.0) or longitude(-90, 90) is out of range: "
                    + latitude + ", " + longitude);
        }
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    private boolean coordinateValidator(double latitude, double longitude) {
        return latitude >= -90.0 && latitude <= 90.0 && longitude >= -180 && longitude <= 180.0;
    }
}
