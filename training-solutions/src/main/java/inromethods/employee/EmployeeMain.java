package inromethods.employee;

public class EmployeeMain {

    public static void main(String[] args) {
        Employee employee = new Employee("John Doe", 2011, 140000);

        System.out.println("Dolgozó neve: " + employee.getName());
        System.out.println("Munkába állás ideje: " + employee.getHiringYear());
        System.out.println("Fizetése: " + employee.getSalary());
        employee.raiseSalary(25000);
        System.out.println("Megemelt fizetés: " + employee.getSalary());
    }
}
