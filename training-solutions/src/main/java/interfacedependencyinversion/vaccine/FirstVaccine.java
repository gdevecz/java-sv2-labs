package interfacedependencyinversion.vaccine;

import java.util.ArrayList;
import java.util.List;

public class FirstVaccine implements Vaccine{

    private List<Person> vaccinationList = new ArrayList<>();

    @Override
    public List<Person> getVaccinationList() {
        List<Person> tmp = new ArrayList<>(vaccinationList);
        List<Person> result = new ArrayList<>();
        result.add();
    }

    @Override
    public void generateVaccinationList(List<Person> registrated) {

    }

    private List<Person> getPregnants() {
        List<Person> result = new ArrayList<>();
        for (Person person : vaccinationList) {
            if (person.getPregnant()==Pregnancy.YES) {
                result.add(person);
            }
        }
        return result;
    }
}
