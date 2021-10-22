package looptypesmodify;

import java.util.ArrayList;
import java.util.List;

public class LanguageSchool {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student("Kovács Elemér"));
        students.add(new Student("Vladimir Iljics Abdullah"));
        students.add(new Student("Uhrin Benedek"));
        students.add(new Student("Bor Ivó"));
        students.add(new Student("Megegy Elek"));
        students.add(new Student("Kovács Isván"));

        students.get(2).setActive(false);
        students.get(4).setActive(false);

        List<Student> removableStudents = new ArrayList();
        for (Student student : students) {
            if (!student.isActive()) {
                removableStudents.add(student);
            }
        }
//        A student instance-ba MÁSOLÓDIK a students éppen aktuális eleme(itt referencia) (mint a paraméterlistában)
//        primitív típusokat így ne tudok megváltoztatni (nem írja vissza a listába), de referencián kersztül
//        módosíthatók az adatok(mint a paraméterlistában)
//        System.out.println(students.get(2));
//        System.out.println(removableStudents.get(0));
//        System.out.println(students.get(4));
//        System.out.println(removableStudents.get(1));
//        System.out.println("A tanulók listája:");
//        students.removeAll(removableStudents);
//        for (Student student : students) {
//            student.setName("dr. " + student.getName());
//        }
        for (Student student : students) {
            System.out.println(student.getName());
        }
    }
}
