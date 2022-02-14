package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamsDemo {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("John Doe", 1970),
                new Employee("Jack Doe", 1980),
                new Employee("Jane Doe", 1990)
        );

//        List<String> names = new ArrayList<>();
//        for (Employee employee : employees) {
//            if (employee.getYearOfBirth() < 1990) {
//                names.add(employee.getName());
//            }
//        }

        List<String> names = employees.stream()
                .filter(e -> e.getYearOfBirth() < 1990)
                .map(Employee::getName)
                .map(String::toUpperCase)
                .toList();

        System.out.println(names);
    }
}
