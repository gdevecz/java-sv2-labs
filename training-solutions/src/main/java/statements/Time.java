package statements;

public class Time {

    private int hours;

    private int minutes;

    private int seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getInMinutes() {
        return hours * 60 + minutes;
    }

    public int getSeconds() {
        return getInMinutes() * 60 + seconds;
    }

    public boolean earlierThan(Time anotherTime) {
        return getSeconds() < anotherTime.getSeconds();
    }

    @Override
    public String toString() {
        return hours + ":" + minutes + ":" + seconds;
    }
}
