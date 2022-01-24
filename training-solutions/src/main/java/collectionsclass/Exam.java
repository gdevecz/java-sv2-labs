package collectionsclass;

import java.text.Collator;
import java.util.*;

public class Exam {

    private List<ExamResult> exams;

    public Exam(List<ExamResult> exams) {
        this.exams = exams;
        exams.sort(new Comparator<ExamResult>() {
            @Override
            public int compare(ExamResult o1, ExamResult o2) {
                return o2.getResult() - o1.getResult();
            }
        });
    }

    public List<String> getNamesOfSucceededPeople(int places) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < Math.min(places, exams.size()); i++) {
            result.add(exams.get(i).getName());
        }
        return result;
    }

    public List<ExamResult> getExams() {
        return exams;
    }
}
