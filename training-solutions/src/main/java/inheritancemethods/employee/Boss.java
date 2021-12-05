package inheritancemethods.employee;

public class Boss extends Employee {

    private static final double LEADERSHIP_FACTOR = 0.1;

    private int numberOfEmployee;

    public Boss(String name, String address, double salary, int numberOfEmployee) {
        super(name, address, salary);
        this.numberOfEmployee = numberOfEmployee;
    }

    @Override
    public double getSalary() {
        return super.getSalary() + super.getSalary() * LEADERSHIP_FACTOR * numberOfEmployee;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployee;
    }
}
