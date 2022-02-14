package lambdacomparator;

public class Employee {

    private String name;

    private int salary;

    private String cardNumber;

    public Employee(String name, int salary, String cardNumber) {
        this.name = name;
        this.salary = salary;
        this.cardNumber = cardNumber;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public String getCardNumber() {
        return cardNumber;
    }
}
