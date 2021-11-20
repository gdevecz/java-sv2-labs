package introexceptionthrow;

public class Adult {

    private String name;

    private int age;

    public Adult(String name, int age) {
        this.name = name;
        if (age >= 18) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Underage! Cannot be regestered!");
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}