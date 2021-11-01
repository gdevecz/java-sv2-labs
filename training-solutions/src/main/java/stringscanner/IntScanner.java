package stringscanner;

import java.util.Scanner;

public class IntScanner {

    public String convertInts(String ints) {
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(ints).useDelimiter(";");
        boolean start = true;
        int number;
        while (sc.hasNext()) {
            if ((number = Integer.parseInt(sc.next())) > 100) {
                if (start) {
                    start = false;
                } else {
                    sb.append(",");
                }
                sb.append(number);
            }
        }
        return sb.toString();

    }
}
