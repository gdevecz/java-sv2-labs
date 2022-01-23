package collectionscomp;

import java.text.Collator;
import java.util.*;

public class School {

    public static void main(String[] args) {
        Set<Student> students = new TreeSet<>(new StudentComparator());

        Student firstStudent = new Student("Úttörő Lajos", 135);
        Student secondStudent = new Student("Kiss József", 122);
        Student thirdStudent = new Student("Molnár Irén", 144);
        Student fourthStudent = new Student("Álmos Árpád", 118);
        Student fifthStudent = new Student("Illyés Borbála", 138);
        Student sixthStudent = new Student("Órás Eleonóra", 160);
        students.add(firstStudent);
        students.add(secondStudent);
        students.add(thirdStudent);
        students.add(fourthStudent);
        students.add(fifthStudent);
        students.add(sixthStudent);

        System.out.println(students);

        Map<String, Integer> students2 = new TreeMap<>(Collator.getInstance(new Locale("hu", "HU")));


        students2.put(firstStudent.getName(), firstStudent.getHeight());
        students2.put(secondStudent.getName(), secondStudent.getHeight());
        students2.put(thirdStudent.getName(), thirdStudent.getHeight());
        students2.put(fourthStudent.getName(), fourthStudent.getHeight());
        students2.put(fifthStudent.getName(), fifthStudent.getHeight());
        students2.put(sixthStudent.getName(), sixthStudent.getHeight());

        System.out.println(students2);

    }
}
