package interfacedependencyinversion.vaccine;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class VaccineTest {

    Vaccine vaccine;

    List<Person> registrated = new ArrayList<>();

    @BeforeEach
    void init() {
        registrated.add(new Person("John Doe", 30, ChronicDisease.NO, Pregnancy.NO));
        registrated.add(new Person("Joan Doe", 30, ChronicDisease.NO, Pregnancy.YES));
        registrated.add(new Person("Jack Doe", 70, ChronicDisease.NO, Pregnancy.NO));
        registrated.add(new Person("Jill Doe", 70, ChronicDisease.YES, Pregnancy.NO));
        registrated.add(new Person("Jean Doe", 30, ChronicDisease.YES, Pregnancy.NO));
    }

    @Test
    void firstVaccinaTest() {
        vaccine = new FirstVaccine();
        List<Person> result = vaccine.generateVaccinationList(registrated);
        List<Person> expected = new ArrayList<>();
        expected.add(registrated.get(1));
        expected.add(registrated.get(3));
        expected.add(registrated.get(0));
        expected.add(registrated.get(2));
        expected.add(registrated.get(4));

        assertEquals(5,result.size());
        assertEquals(expected.get(0),result.get(0));
    }

    @Test
    void secondVaccineTest() {
        vaccine = new SecondVaccine();
        List<Person> result = vaccine.generateVaccinationList(registrated);
        List<Person> expected = new ArrayList<>();
        expected.add(registrated.get(0));
        expected.add(registrated.get(2));


        assertEquals(2,expected.size());
        assertEquals(expected.get(0),result.get(0));
        assertEquals(expected.get(1),result.get(1));
    }
}