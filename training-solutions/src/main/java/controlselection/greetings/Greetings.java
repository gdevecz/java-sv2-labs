package controlselection.greetings;

public class Greetings {

    public String greeting(int hours, int minutes) {
        if ((hours < 5
                || (hours == 5 && minutes == 00))
                || hours >= 20) {
            return "Good night!";
        } else if (hours < 9 || (hours == 9 && minutes == 00)) {
            return "Good morning!";
        } else if (hours < 18 || (hours == 18 && minutes < 30)) {
            return "Good day!";
        } else {
            return "Good evening!";
        }
    }
}
