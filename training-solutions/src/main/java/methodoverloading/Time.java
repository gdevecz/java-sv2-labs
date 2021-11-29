package methodoverloading;

public class Time {

    private int hours;

    private int minutes;

    private int seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public Time(Time time) {
        this(time.getHours(), time.getMinutes(), time.getSeconds());
    }

    public boolean isEqual(Time time) {
        return isEqual(time.getHours(), time.getMinutes(), time.getSeconds());
    }

    public boolean isEqual(int hours, int minutes, int seconds) {
        if (this.hours == hours
                && this.minutes == minutes
                && this.seconds == seconds) {
            return true;
        }
        return false;
    }

    public boolean isEarlier(Time time) {
        return this.timeInSeconds() < time.timeInSeconds();
    }

    public boolean isEarlier(int hours, int minutes, int seconds) {
        return this.timeInSeconds() < timeInSeconds(hours, minutes, seconds);
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    private long timeInSeconds() {
        return (hours * 60 + minutes) * 60 + seconds;
    }

    private long timeInSeconds(int hours, int minutes, int seconds) {
        return (hours * 60 + minutes) * 60 + seconds;
    }
}
