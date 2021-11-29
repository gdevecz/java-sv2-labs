package constructoroverloading.bus;

import java.util.ArrayList;
import java.util.List;

public class BusTimeTable {

    private List<SimpleTime> timeTable;

    public BusTimeTable(List<SimpleTime> timeTable) {
        this.timeTable = timeTable;
    }

    public BusTimeTable(int firstHour, int lastHour, int everyMinute) {
        timeTable = new ArrayList<>();
        for (int i = firstHour; i < lastHour; i++) {
            for (int j = 0; j < 60; j += everyMinute) {
                timeTable.add(new SimpleTime(i, j));
            }
        }
        timeTable.add(new SimpleTime(lastHour));
    }

    public List<SimpleTime> getTimeTable() {
        return timeTable;
    }

    public SimpleTime getNextBus(SimpleTime actual) {
        for (SimpleTime st : timeTable) {
            if (st.getDifference(actual) < 0) {
                return st;
            }
        }
        throw new IllegalArgumentException("There is not bus after: " + actual);
    }
}
