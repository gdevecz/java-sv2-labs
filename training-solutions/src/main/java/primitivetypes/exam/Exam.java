package primitivetypes.exam;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Exam {

    private List<Person> persons = new ArrayList<>();

    public List<Person> getPersons() {
        return persons;
    }

    public void addPerson(Person person) {
        persons.add(person);
    }

    public Person personFromString(String data) {
        String[] datas = data.split(",");
        String[] dateDatas = datas[1].split("\\.");
        return new Person(
                datas[0].strip(),
                LocalDate.of(
                        Integer.parseInt(dateDatas[0].strip()),
                        Integer.parseInt(dateDatas[1].strip()),
                        Integer.parseInt(dateDatas[2].strip())),
                Integer.parseInt(datas[2].strip()),
                Double.parseDouble(datas[3].strip()));
    }

    public boolean isValidStringForPerson(String data) {
        String[] datas = data.split(",", 4);
        if (datas.length < 4) {
            return false;
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
        if (LocalDate.parse(datas[1].strip(), formatter) == null) {
            return false;
        }
        if ((Integer.valueOf(datas[2].strip())) == null) {
            return false;
        }
        if (Double.valueOf(datas[3]) == null) {
            return false;
        }
        return true;
    }
}
