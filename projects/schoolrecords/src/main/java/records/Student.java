package records;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;

    private List<Mark> marks = new ArrayList<>();

    public Student(String name) {
        Validator.isStudentNameValid(name);
        this.name = name;
    }

    public void grading(Mark mark) {
        Validator.isMarkValid(mark);
        marks.add(mark);
    }

    public double calculateAverage() {
        double result = 0.0;
        if (!marks.isEmpty()) {
            result = calculateAverageOfMarks(marks);
        }
        return roundTwoDecimalPoints(result);
    }

    public double calculateSubjectAverage(Subject subject) {
        List<Mark> marksOfSubjects = new ArrayList<>();
        for (Mark mark : marks) {
            if (mark.getSubject().getSubjectName().equals(subject.getSubjectName())) {
                marksOfSubjects.add(mark);
            }
        }
        double result = 0.0;
        if (!marksOfSubjects.isEmpty()) {
            result = calculateAverageOfMarks(marksOfSubjects);
        }
        return roundTwoDecimalPoints(result);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(name + " marks:");
        for (Mark mark : marks) {
            sb.append(" ").append(mark.getSubject().getSubjectName() + ": " + mark);
        }
        return sb.toString();
    }

    public String getName() {
        return name;
    }

    private double calculateAverageOfMarks(List<Mark> marks) {
        double sum = 0.0;
        for (Mark mark : marks) {
            sum += mark.getMarkType().getGrade();
        }
        if (sum == 0.0) {
            throw new ArithmeticException("No marks present, average calculation aborted!");
        }
        sum /= marks.size();
        return sum;
    }

    private double roundTwoDecimalPoints(double d) {
        return Math.round(d * 100.0) / 100.0;
    }
}
