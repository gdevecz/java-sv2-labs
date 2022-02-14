package streamsalgorithms;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeMain {

    private static final IllegalStateException SOURCE_IS_EMPTY = new IllegalStateException("empty");

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("John Doe", 1970),
                new Employee("Jack Doe", 1990),
                new Employee("Jane Doe", 1980),
                new Employee("John Smith", 1960)
        );

        employees.forEach(e -> System.out.println(e.getName() + ", " + e.getYearOfBirth()));
        System.out.println("Összegezd az alkalmazottak születési éveit!");
        int sumOfYearOfBirths =
                employees.stream()
                        .mapToInt(Employee::getYearOfBirth)
                        .sum();
        System.out.println(sumOfYearOfBirths);
        System.out.println("Összegezd az alkalmazottak életkorát!");
        int sumOfAges =
                employees.stream()
//                        .mapToInt(e -> LocalDate.now().getYear() - (e.getYearOfBirth()))
                        .mapToInt(Employee::getYearOfBirth)
                        .map(n -> LocalDate.now().getYear() - n)
                        .sum();
        System.out.println(sumOfAges);
        System.out.println("Add vissza streammel, hány alkalmazott van a listában!");
        long numberOfEmployees =
                employees.stream()
                        .count();
        System.out.println(numberOfEmployees);
        System.out.println("Add vissza, hány alkalmazott született 1990-nél korábban!");
        long sumOfEmployeesBirthBefore =
                employees.stream()
                        .filter(e -> e.getYearOfBirth() < 1990)
                        .count();
        System.out.println(sumOfEmployeesBirthBefore);
        System.out.println("Add vissza, hány alkalmazott született 1980-nál korábban!");
        sumOfEmployeesBirthBefore =
                employees.stream()
                        .filter(e -> e.getYearOfBirth() < 1980)
                        .count();
        System.out.println(sumOfEmployeesBirthBefore);
        System.out.println("Add vissza a legkorábban született alkalmazott születési évét!");
        int youngestAgeOfEmployees =
                employees.stream()
                        .mapToInt(Employee::getYearOfBirth)
                        .min()
                        .orElseThrow(() -> SOURCE_IS_EMPTY);
        System.out.println(youngestAgeOfEmployees);
        System.out.println("Add vissza a legkorábban született alkalmazott nevét! (min())");
        String odlestEmployee =
                employees.stream()
                        .min(Comparator.comparing(Employee::getYearOfBirth))
                        .orElseThrow(() -> SOURCE_IS_EMPTY)
                        .getName();
        System.out.println(odlestEmployee);
        System.out.println("Add vissza a legkorábban született alkalmazott nevét! (findFirst())");
        odlestEmployee =
                employees.stream()
                        .sorted(Comparator.comparing(Employee::getYearOfBirth))
                        .findFirst()
                        .orElseThrow(() -> SOURCE_IS_EMPTY)
                        .getName();
        System.out.println(odlestEmployee);
        System.out.println("Add vissza, hogy igaz-e, hogy minden alkalmazott 1980 előtt született-e?");
        boolean everyoneBirthBefore =
                employees.stream()
                        .allMatch(e -> e.getYearOfBirth() < 1980);
        System.out.println(everyoneBirthBefore);
        List<Employee> employeesBirthBefore =
                employees.stream()
                        .filter(e -> e.getYearOfBirth() < 1990)
                        .toList();
        employeesBirthBefore.forEach(e -> System.out.println(e.getName() + ", " + e.getYearOfBirth()));
        System.out.println("Add vissza egy listában az összes alkalmazott nevét!");
        List<String> namesOfEmployees =
                employees.stream()
                        .map(Employee::getName)
                        .toList();
        namesOfEmployees.forEach(System.out::println);
        System.out.println("Add vissza egy listában az összes, 1990-nél korábban született alkalmazott nevét!");
        List<String> namesOfEmployeesBirthBefore =
                employees.stream()
                        .filter(e -> e.getYearOfBirth() < 1990)
                        .map(Employee::getName)
                        .toList();
        namesOfEmployeesBirthBefore.forEach(System.out::println);
    }
}
