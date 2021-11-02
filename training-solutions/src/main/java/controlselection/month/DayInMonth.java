package controlselection.month;

public class DayInMonth {

    public int getNumberOfDaysInMonth(int year, String searchedMonth) {
        Month month = monthFromString(searchedMonth);
        if (yearIsLeapYear(year)) {
            return month.getDaysInMonthInLeapYears();
        }
        return month.getDaysInMonth();
    }

    public Month monthFromString(String searchedMonth) {
        for (Month month : Month.values()) {
            if (month.getName().equals(searchedMonth.toLowerCase())) {
                return month;
            }
        }
        return null;
    }

    public boolean yearIsLeapYear(int year) {
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            return true;
        }
        return false;
    }
}
