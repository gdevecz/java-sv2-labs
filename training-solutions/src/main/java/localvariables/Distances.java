package localvariables;

public class Distances {

    private double distanceInKm;
    private boolean exact;

    public Distances(double distanceInKm, boolean exact) {
        this.distanceInKm = distanceInKm;
        this.exact = exact;
    }

    public double getDistanceInKm() {
        return distanceInKm;
    }

    public boolean isExact() {
        return exact;
    }
}
