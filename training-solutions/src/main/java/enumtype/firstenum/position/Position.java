package enumtype.firstenum.position;

public enum Position {
    Összeszerelő(185000,"bejárási támogatás"),
    Gépkarbantartó(250000,"bejárási támogatás, cafeteria"),
    Csoportvezető(500000,"céges autó, mobil");

    private int salary;

    private String benefit;

    Position(int salary, String benefit) {
        this.salary = salary;
        this.benefit = benefit;
    }

    public int getSalary() {
        return salary;
    }

    public String getBenefit() {
        return benefit;
    }
}
