package introexceptioncause;

public class Tracking {

    public static void main(String[] args) {
        TrackPoints trackPoints = new TrackPoints();
        try {
            trackPoints.loadTrackingPoints("src/main/resources/introexceptioncause/tracking.csv");
            trackPoints.printLevelDifferences();
        } catch (IllegalStateException ise) {
            System.out.println(ise.getMessage());
            ise.printStackTrace();
            System.out.println("Cause:");
            System.out.println(ise.getCause());
            System.out.println(ise.getCause().getMessage());
            ise.getCause().printStackTrace();
        }
    }
}