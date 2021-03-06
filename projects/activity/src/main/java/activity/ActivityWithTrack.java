package activity;

public class ActivityWithTrack implements Activity {

    private Track track;

    private ActivityType type;

    public ActivityWithTrack(Track track, ActivityType type) {
        this.track = track;
        this.type = type;
    }

    public Track getTrack() {
        return track;
    }

    @Override
    public double getDistance() {
        return track.getDistance();
    }

    @Override
    public ActivityType getType() {
        return type;
    }
}
