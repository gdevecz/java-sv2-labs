package stringbasic;

public class UniversityMain {

    public static void main(String[] args) {
        Person person1 = new Person(
                "John Doe",
                "jd@gmail.com",
                "234t",
                "234 231 533",
                "(90) 34353-666");

        Person person2 = new Person(
                "William Wallace",
                "ww@gmail.com",
                "234afaat",
                "1212 42 6546",
                "(90) 34353-666");

        Student student1 = new Student(person1,"dfe233","werff122");
        Student student2 = new Student(person2,"af21fq","21f31gsd");

        University university = new University();
        university.addStudent(student1);
        university.addStudent(student2);
        System.out.println(university.getStudents().size());
        System.out.println(university.areEqual(
                university.getStudents().get(0),
                university.getStudents().get(1)
        ));
        university.getStudents().get(1).setNeptunCode("dfe233");
        university.getStudents().get(1).setEducationalID("werff122");
        System.out.println(university.areEqual(
                university.getStudents().get(0),
                university.getStudents().get(1)
        ));
    }
}
