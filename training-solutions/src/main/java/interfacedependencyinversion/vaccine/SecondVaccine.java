package interfacedependencyinversion.vaccine;

import java.util.ArrayList;
import java.util.List;

public class SecondVaccine implements Vaccine {

    private List<Person> vaccinationList = new ArrayList<>();

    @Override
    public List<Person> getVaccinationList() {
        return vaccinationList;
    }

    @Override
    public List<Person> generateVaccinationList(List<Person> registrated) {
        List<Person> tmp = new ArrayList<>(registrated);
        tmp.removeAll(getPregnantsAndChronics(tmp));
        List<Person> result = getYounger(tmp);
        tmp.removeAll(result);
        result.addAll(tmp);
        return result;
    }

    private List<Person> getPregnantsAndChronics(List<Person> persons) {
        List<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (person.getPregnant() == Pregnancy.YES || person.getChronic() == ChronicDisease.YES) {
                result.add(person);
            }
        }
        return result;
    }

    private List<Person> getYounger(List<Person> persons) {
        List<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (person.getAge() <= 65) {
                result.add(person);
            }
        }
        return result;
    }
}
