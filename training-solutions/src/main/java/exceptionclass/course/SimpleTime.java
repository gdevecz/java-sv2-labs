package exceptionclass.course;

public class SimpleTime {

    private int hour;

    private int minute;

    public SimpleTime(int hour, int minute) {
        timeValidator(hour,minute);
        this.hour = hour;
        this.minute = minute;
    }

    public SimpleTime(String data) {
        if (data == null) {
            throw new InvalidTimeException("Time is null");
        }
        String[] tmp = data.split(":");
        if (!(isValidNumber(tmp[0]) && isValidNumber(tmp[1]))) {
            throw new InvalidTimeException("Time is not hh:mm");
        }
        hour = Integer.parseInt(tmp[0]);
        minute = Integer.parseInt(tmp[1]);
        timeValidator(hour,minute);
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d", hour, minute);
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    private boolean isValidNumber(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    private void timeValidator(int hour, int minute) {
        if (hour < 0 || hour > 23) {
            throw new InvalidTimeException("Hour is invalid (0-23)");
        }
        if (minute < 0 || minute > 59) {
            throw new InvalidTimeException("Minute is invalid (0-59)");
        }
    }
}
