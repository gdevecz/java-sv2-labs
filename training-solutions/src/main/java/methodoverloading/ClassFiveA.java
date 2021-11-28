package methodoverloading;

import java.util.ArrayList;
import java.util.List;

public class ClassFiveA {

    List<String> roster = new ArrayList<>();

    public String getTodayReferringStudent(int number) {
        return roster.get(number);
    }

    public String getTodayReferringStudent(Number number) {
        return roster.get(number.ordinal());
    }

    public String getTodayReferringStudent(String numberName) {
        return roster.get(Number.valueOf(numberName.toUpperCase()).ordinal());
    }

    public void addToRoster(String name) {
        roster.add(name);
    }
}
