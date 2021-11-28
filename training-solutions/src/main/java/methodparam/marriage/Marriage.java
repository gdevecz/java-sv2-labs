package methodparam.marriage;

import java.time.LocalDate;

public class Marriage {

    public void getMarried(Woman woman, Man man) {
        addMarriageToDates(woman, man);
        woman.setName(setMarriedName(woman, man));
    }

    private String setMarriedName(Woman wife, Man husband) {
        return husband.getFamilyName() + " " + wife.getChristianName();
    }

    private void addMarriageToDates(Woman wife, Man husband) {
        RegisterDate dateOfMarriage = new RegisterDate("házasságkötés ideje", LocalDate.now());
        wife.addRegisterDate(dateOfMarriage);
        husband.addRegisterDate(dateOfMarriage);
    }
}
