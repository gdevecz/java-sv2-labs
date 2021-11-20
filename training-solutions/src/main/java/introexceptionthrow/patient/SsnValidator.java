package introexceptionthrow.patient;

public class SsnValidator {

    public boolean isValidSsn(String ssn) {
        if (ssn.length() != 9) {
            return false;
        }
        int sumOfEvens = 0;
        int sumOfOdds = 0;
//        for (int i = 0; i < ssn.length() - 1; i++) {
//            if (i % 1 == 0) {
//                sumOfEvens += ssn.charAt(i) - '0';
//            } else {
//                sumOfOdds += ssn.charAt(i) - '0';
//            }
//        }
        int number;
        try {
            number = Integer.parseInt(ssn);
        } catch (NumberFormatException nfe) {
            throw new IllegalArgumentException("the input is not number!");
        }
        number /= 10;
        boolean isEven = true;
        while (number > 0) {
            if (isEven) {
                sumOfEvens += number % 10;
            } else {
                sumOfOdds += number % 10;
            }
            number /= 10;
            isEven=!isEven;
        }
        int sum = sumOfEvens * 7 + sumOfOdds * 3;
        return (sum % 10) == Integer.parseInt(ssn.substring(8));
    }
}