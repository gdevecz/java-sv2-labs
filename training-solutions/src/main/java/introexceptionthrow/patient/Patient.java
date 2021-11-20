package introexceptionthrow.patient;

public class Patient {

    private String name;

    private String SocialSecurityNumber;

    private int yearOfBirth;

    public Patient(String name, String ssn, int yearOfBirth) {
        isValidString(name);
        this.name = name;
        isValidSsn(ssn);
        SocialSecurityNumber = ssn;
        isValidNumber(yearOfBirth);
        this.yearOfBirth = yearOfBirth;
    }

    private void isValidString(String s) {
        if (s == null) {
            throw new IllegalArgumentException("The data is null!");
        }
        if (s.isBlank()) {
            throw new IllegalArgumentException("The data is empty!");
        }
    }

    private void isValidNumber(int i) {
        if (i < 1900) {
            throw new IllegalArgumentException("The year of birth is too early!");
        }
    }

    private void isValidSsn(String ssn) {
        if (!new SsnValidator().isValidSsn(ssn)) {
            throw new IllegalArgumentException("The ssn is invalid!");
        }
    }

    public String getName() {
        return name;
    }

    public String getSocialSecurityNumber() {
        return SocialSecurityNumber;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }
}
