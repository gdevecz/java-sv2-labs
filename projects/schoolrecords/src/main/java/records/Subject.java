package records;

public class Subject {

    private String subjectName;

    public Subject(String name) {
        Validator.isNameValid(name);
        this.subjectName = name;
    }

    public String getSubjectName() {
        return subjectName;
    }
}
