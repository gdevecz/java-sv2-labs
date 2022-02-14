package activity;

import java.util.*;

public class Activities {

    private List<Activity> activities;

    public Activities(List<Activity> activities) {
        this.activities = activities;
    }

    public List<Activity> getActivities() {
        return activities;
    }

    public int numberOfTrackActivities() {
        return (int) activities.stream()
                .filter(ActivityWithTrack.class::isInstance)
                .count();
    }

    public int numberOfWithoutTrackActivities() {
        return (int) activities.stream()
                .filter(ActivityWithoutTrack.class::isInstance)
                .count();
    }

    public List<Report> distancesByTypes() {
        Map<ActivityType, Double> temp = new LinkedHashMap<>();
        Arrays.stream(ActivityType.values()).forEach(a -> temp.put(a, 0.0));
        activities.forEach(a -> temp.put(a.getType(), temp.get(a.getType())+a.getDistance()));
        return temp.entrySet().stream()
                .map(a -> new Report(a.getKey(), a.getValue()))
                .toList();
    }
}
