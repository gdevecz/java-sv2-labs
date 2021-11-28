package methodparam.marriage;

import java.util.ArrayList;
import java.util.List;

public class Woman {

    private String name;

    private List<RegisterDate> registerDates = new ArrayList<>();

    public Woman(String name) {
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

    public void setName(String newName) {
        this.name = newName;
    }

    public List<RegisterDate> getRegisterDates() {
        return registerDates;
    }
}
