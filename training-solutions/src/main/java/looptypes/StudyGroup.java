package looptypes;

import java.util.ArrayList;
import java.util.List;

public class StudyGroup {

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
