package records;

import java.util.List;

public class Tutor {

    private String name;

    private List<Subject> taughtSubjects;

    public Tutor(String name, List<Subject> taughtSubjects) {
        Validator.isNameValid(name);
        if (taughtSubjects == null) {
            throw new NullPointerException("The list of subject can not be null.");
        }
        this.name = name;
        this.taughtSubjects = taughtSubjects;
    }

    public boolean tutorTeachingSubject(Subject subject) {
        Validator.isSubjectValid(subject);
        for (Subject item : taughtSubjects) {
            if (subject.getSubjectName().equals(item.getSubjectName())) {
                return true;
            }
        }
        return false;
    }

    public String getName() {
        return name;
    }
}
