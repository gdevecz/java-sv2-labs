package interfacedependencyinversion.vaccine;

import java.util.ArrayList;
import java.util.List;

public class FirstVaccine implements Vaccine {

    private List<Person> vaccinationList = new ArrayList<>();

    @Override
    public List<Person> getVaccinationList() {
        return vaccinationList;
    }

    @Override
    public List<Person> generateVaccinationList(List<Person> registrated) {
        List<Person> tmp = new ArrayList<>(registrated);
        List<Person> result = getPregnants(tmp);
        tmp.removeAll(result);
        result.addAll(getElders(tmp));
        tmp.removeAll(result);
        result.addAll(tmp);
        return result;
    }

    private List<Person> getPregnants(List<Person> persons) {
        List<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (person.getPregnant() == Pregnancy.YES) {
                result.add(person);
            }
        }
        return result;
    }

    private List<Person> getElders(List<Person> persons) {
        List<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (person.getAge() > 65) {
                result.add(person);
            }
        }
        return result;
    }
}
