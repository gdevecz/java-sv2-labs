package looptypes;

import java.util.ArrayList;
import java.util.List;

public class StudyGroup {

    public static void main(String[] args) {
        StudyGroup sg= new StudyGroup();
        List<String> students = new ArrayList<>();
        students.add("Gyurcsány Ferenc");
        students.add("Megegy Elek");
        students.add("Bor Ivó");
        students.add("Netuddky");
        students.add("Orbán Viktor");

        sg.printStudyGroups(students);

    }

    public void printStudyGroups(List<String> students) {
        List<String> shorterOrEqualsThanTen = new ArrayList<>();
        List<String> longerThanTen = new ArrayList<>();

        for (String student : students) {
            if (student.length()>10) {
                longerThanTen.add(student);
            } else {
                shorterOrEqualsThanTen.add(student);
            }
        }

        System.out.println(shorterOrEqualsThanTen);
        System.out.println(longerThanTen);
    }
}
