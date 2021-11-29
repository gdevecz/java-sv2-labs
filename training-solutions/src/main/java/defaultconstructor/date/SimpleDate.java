package defaultconstructor.date;

public class SimpleDate {

    private int year;

    private int month;

    private int day;

    public void setDate(int year, int month, int day) {
        if (isCorrect(year, month, day)) {
            this.year = year;
            this.month = month;
            this.day = day;
        }
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }


    private boolean isCorrect(int year, int month, int day) {
        if (year < 1900) {
            throw new IllegalArgumentException("The year is invalid: " + year);
        }
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException(("The month is invalid: " + month));
        }
        if (day < 1 || day > calculateMonthLength(year, month)) {
            throw new IllegalArgumentException("The day is invalid: " + day);
        }
        return true;
    }

    private boolean isLeapYear(int year) {
        if (year % 4 == 0 && ((!(year % 100 == 0)) || year % 400 == 0)) {
            return true;
        }
        return false;
    }

    private int calculateMonthLength(int year, int month) {
        int[] daysOfMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (isLeapYear(year)) {
            daysOfMonths[2]++;
        }
        return daysOfMonths[month - 1];
    }
}
