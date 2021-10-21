package introdate;

import java.util.Scanner;

public class EmployeeTest {

    public static void main(String[] args) {

        Employee employee;

        int year;
        int month;
        int day;
        String name;

        Scanner sc = new Scanner(System.in);
        System.out.print("Name of employee: ");
        name = sc.nextLine();
        System.out.println("Employee's date of birth: ");
        System.out.print("year: ");
        year = sc.nextInt();
        System.out.print("month: ");
        month = sc.nextInt();
        System.out.print("day: ");
        day = sc.nextInt();

        employee = new Employee(year, month, day, name);

        System.out.println("Details of the new employee: ");
        System.out.println("name: " + employee.getName());
        System.out.println("Date of birth: " + employee.getDateOfBirth());
        System.out.println("Start working: " + employee.getBeginEmployment());
    }
}
