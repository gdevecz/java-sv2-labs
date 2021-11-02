package controlselection.month;

public enum Month {
    JANUAR("január",31,31),
    FEBRUAR("február",28,29),
    MARCIUS("március",31,31),
    APRILIS("április",30,30),
    MAJUS("május",31,31),
    JUNIUS("június",30,30),
    JULIUS("július",31,31),
    AUGUSZTUS("augusztus",31,31),
    SZEPTEMBER("szeptember",30,30),
    OKTOBER("október",31,31),
    NOVEMBER("november",30,30),
    DECEMBER("december",31,31);

    private String name;

    private int daysInMonth;

    private int daysInMonthInLeapYears;

    Month(String name, int daysInMonth, int daysInMonthInLeapYears) {
        this.name = name;
        this.daysInMonth = daysInMonth;
        this.daysInMonthInLeapYears = daysInMonthInLeapYears;
    }

    public String getName() {
        return name;
    }

    public int getDaysInMonth() {
        return daysInMonth;
    }

    public int getDaysInMonthInLeapYears() {
        return daysInMonthInLeapYears;
    }
}
