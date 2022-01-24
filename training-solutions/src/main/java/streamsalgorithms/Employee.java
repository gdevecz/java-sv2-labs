package streamsalgorithms;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Employee {

    private String name;

    private int yearOfBirth;

    public Employee(String name, int yearOfBirth) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    @Override
    public String toString() {
        return name + ", " + yearOfBirth;
    }

    public static void main(String[] args) {

        List<Employee> employees = List.of(
                new Employee("Jack Doe", 1990),
                new Employee("John Doe", 1975),
                new Employee("Joe Doe", 1983)
        );

        System.out.println("Összegezd az alkalmazottak születési éveit:");
        System.out.println(
                employees.stream()
                        .mapToInt(Employee::getYearOfBirth)
                        .sum())
        ;
        System.out.println();
        System.out.println("Összegezd az alkalmazottak életkorát:");
        System.out.println(
                employees.stream()
                        .mapToInt(employee -> LocalDate.now().getYear() - employee.yearOfBirth)
                        .sum())
        ;
        System.out.println();
        System.out.println("Add vissza streammel, hány alkalmazott van a listában:");
        System.out.println(
                employees.stream()
                        .count()
        );
        System.out.println();
        System.out.println("Add vissza, hány alkalmazott született 1990-nél korábban:");
        System.out.println(
                employees.stream()
                        .filter(employee -> employee.yearOfBirth < 1990)
                        .count()
        );
        System.out.println();
        System.out.println("Add vissza a legkorábban született alkalmazott születési évét:");
        System.out.println(
                employees.stream()
                        .mapToInt(Employee::getYearOfBirth)
                        .min()
        );
        System.out.println();
        System.out.println("Add vissza a legkorábban született alkalmazott nevét:");
        System.out.println(
                employees.stream()
                        .sorted(new Comparator<Employee>() {
                            @Override
                            public int compare(Employee o1, Employee o2) {
                                return o1.yearOfBirth - o2.yearOfBirth;
                            }
                        })
                        .map(Employee::getName)
                        .findFirst()
        );
        System.out.println();
        System.out.println("Add vissza, hogy igaz-e, hogy minden alkalmazott 1980 előtt született-e:");
        System.out.println(
                employees.stream()
                        .filter(employee -> employee.yearOfBirth < 1980)
                        .count()
                        == employees.size()
        );
        System.out.println();
        System.out.println("Add vissza egy listában az összes, 1990-nél korábban született alkalmazottat:");
        System.out.println(
                employees.stream()
                        .filter(employee -> employee.yearOfBirth<1990)
                        .collect(Collectors.toList())
        );
        System.out.println();
        System.out.println("Add vissza egy listában az összes alkalmazott nevét:");
        System.out.println(
                employees.stream()
                        .map(Employee::getName)
                        .collect(Collectors.toList())
        );
        System.out.println();
        System.out.println("Az előző két feladat kombinációja:\n" +
                "Add vissza egy listában az összes, 1990-nél korábban született alkalmazott nevét:");
        System.out.println(
                employees.stream()
                        .filter(employee -> employee.yearOfBirth<1990)
                        .map(Employee::getName)
                        .collect(Collectors.toList())
        );
    }
}
