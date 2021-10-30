package looptypes;

import java.util.ArrayList;
import java.util.List;

public class StudyGroupMain {

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
}
