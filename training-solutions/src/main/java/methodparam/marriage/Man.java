package methodparam.marriage;

import java.util.ArrayList;
import java.util.List;

public class Man {

    private String name;

    private List<RegisterDate> registerDates = new ArrayList<>();

    public Man(String name) {
        this.name = name;
    }

    public String getChristianName() {
        int nameLimit = name.indexOf(" ") + 1;
        return name.substring(nameLimit);
    }

    public String getFamilyName() {
        int nameLimit = name.indexOf(" ");
        return name.substring(0, nameLimit);
    }

    public void addRegisterDate(RegisterDate registerDate) {
        registerDates.add(registerDate);
    }

    public String getName() {
        return name;
    }

    public List<RegisterDate> getRegisterDates() {
        return registerDates;
    }
}
