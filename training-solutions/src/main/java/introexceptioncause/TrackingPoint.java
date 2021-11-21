package introexceptioncause;

public class TrackingPoint {

    private double xCoordinate;

    private double yCoordinate;

    private int level;

    public TrackingPoint(double xCoordinate, double yCoordinate, int level) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.level = level;
    }

    public double getxCoordinate() {
        return xCoordinate;
    }

    public double getyCoordinate() {
        return yCoordinate;
    }

    public int getLevel() {
        return level;
    }
}
