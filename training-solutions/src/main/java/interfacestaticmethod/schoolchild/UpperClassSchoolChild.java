package interfacestaticmethod.schoolchild;

public class UpperClassSchoolChild implements PrimarySchoolChild{

    private String name;

    private int age;

    public UpperClassSchoolChild(int age) {
        this.age = age;
    }

    public UpperClassSchoolChild(String name, int age) {
        this(age);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
