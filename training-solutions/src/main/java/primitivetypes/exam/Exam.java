package primitivetypes.exam;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
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
        String[] datas = data.split(",",4);
        if (datas.length < 4) {
            return false;
        }
        if (isNumberOfStringContainsDigitsAndSecialCharacter(datas[1].strip(), '.') != 2) {
            return false;
        }
        int numberOfColons;
        if ((numberOfColons = isNumberOfStringContainsDigitsAndSecialCharacter(datas[3].strip(), ',')) > 1
                || numberOfColons < 0) {
            return false;
        }
        return true;
    }

    private int isNumberOfStringContainsDigitsAndSecialCharacter(String data, char c) {
        int number = 0;
        for (int i = 0; i < data.length(); i++) {
            if(data.charAt(i) == c) {
                number++;
                continue;
            }
            if (!(Character.isDigit(data.charAt(i)) || data.charAt(i) == c)) {
                return -1;
            }
        }
        return number;
    }
}
