package introexceptionthrow;

public class Patient {

    private String name;

    private String SocialSecurityNumber;

    private int yearOfBirth;

    public Patient(String name, String socialSecurityNumber, int yearOfBirth) {
        isValidString(name);
        isValidString(socialSecurityNumber);
        isValidNumber(yearOfBirth);
        this.name = name;
        SocialSecurityNumber = socialSecurityNumber;
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
