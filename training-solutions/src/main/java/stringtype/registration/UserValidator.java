package stringtype.registration;

public class UserValidator {

    public boolean isValidUsername(String username) {
        return username.length() != 0;
    }

    public boolean isValidPassword(String password1, String password2) {
        return (!(password1.equals(password2)) || password1.length() < 8);
    }

    public boolean isValidEmail(String email) {
        int atIndex = email.indexOf('@');
        int dotIndex = email.indexOf('.',atIndex + 1);
        return (atIndex < 0 || dotIndex == email.length() - 1 || atIndex + 1 > dotIndex);
    }
}
