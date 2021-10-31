package conversions;

import java.util.ArrayList;
import java.util.List;

public class Digits {

    private List<Integer> digits = new ArrayList<>();


    public void addDigitsToList(String text) {
        for (int i = 0; i < text.length(); i++) {
            if(Character.isDigit(text.charAt(i))) {
                digits.add(Integer.parseInt(Character.toString(text.charAt(i))));
            }
        }
    }

    public List<Integer> getDigits() {
        return digits;
    }
}
