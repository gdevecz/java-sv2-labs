package records;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ClassRecords {

    private String className;

    private Random random;

    private List<Student> students = new ArrayList<>();

    public ClassRecords(String className, Random random) {
        Validator.isNameValid(className);
        this.className = className;
        this.random = random;
    }

    public boolean addStudent(Student student) {
        Validator.isStudentValid(student);
        for (Student actual : students) {
            if (actual.getName().equals(student.getName())) {
                return false;
            }
        }
        students.add(student);
        return true;
    }

    public boolean removeStudent(Student student) {
        Validator.isStudentValid(student);
        Student remove = null;
        for (Student actual : students) {
            if (actual.getName().equals(student.getName())) {
                remove = actual;
            }
        }
        if (remove == null) {
            return false;
        }
        students.remove(remove);
        return true;
    }

    public double calculateClassAverage() {
        Validator.isStudentsValid(students);
        double sum = 0.0;
        for (Student student : students) {
            sum += student.calculateAverage();
        }
        if (sum == 0.0) {
            throw new ArithmeticException("No marks present, average calculation aborted!");
        }
        return Math.round(sum / students.size() * 100) / 100.0;
    }

    public double calculateClassAverageBySubject(Subject subject) {
        Validator.isStudentsValid(students);
        double sum = 0.0;
        int hasGrade = 0;
        for (Student student : students) {
            if (student.calculateSubjectAverage(subject) != 0.0) {
                sum += student.calculateSubjectAverage(subject);
                hasGrade++;
            }
        }
        if (sum == 0.0) {
            throw new ArithmeticException("No marks present, class average calculation aborted!");
        }
        return Math.round(sum / hasGrade * 100) / 100.0;
    }

    public Student findStudentByName(String studentName) {
        if (students.isEmpty()) {
            throw new IllegalStateException("No students to search!");
        }
        Validator.isStudentNameValid(studentName);
        for (Student student : students) {
            if (studentName.equals(student.getName())) {
                return student;
            }
        }
        throw new IllegalArgumentException("Student by this name cannot be found! " + studentName);
    }

    public Student repetition() {
        if (students.isEmpty()) {
            throw new IllegalStateException("No students to select for repetition!");
        }
        return students.get(random.nextInt(students.size()));
    }

    public List<StudyResultByName> listStudyResults() {
        List<StudyResultByName> result = new ArrayList<>();
        for (Student student : students) {
            result.add(new StudyResultByName(student.getName(), student.calculateAverage()));
        }
        return result;
    }

    public String listStudentNames() {
        if (students.isEmpty()) {
            throw new ArithmeticException("No student in the class!");
        }
        StringBuilder sb = new StringBuilder();
        boolean first = true;
        for (Student student : students) {
            if (first) {
                first = false;
            } else {
                sb.append(", ");
            }
            sb.append(student.getName());
        }
        return sb.toString();
    }

    public String getClassName() {
        return className;
    }

    private boolean isEmpty(String str) {
        return str == null || str.isBlank();
    }

    private boolean isStudentValid(Student student) {
        return student == null;
    }
}
