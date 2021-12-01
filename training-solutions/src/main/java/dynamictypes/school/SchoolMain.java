package dynamictypes.school;

public class SchoolMain {

    public static void main(String[] args) {
        School schoolOne = new School("iskola",1);
        School schoolTwo = new PrimarySchool("általános", 2);
        School schoolThree = new SecondarySchool("közép", 3);

        System.out.println(schoolOne);
        System.out.println(schoolTwo);
        System.out.println(schoolThree);
    }
}
