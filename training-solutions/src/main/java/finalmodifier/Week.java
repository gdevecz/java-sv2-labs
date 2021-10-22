package finalmodifier;

import java.util.Arrays;
import java.util.List;

public class Week {

    public static void main(String[] args) {
        List<String> daysOfWeek =
                Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday");

        daysOfWeek.set(1, "Wednesday");
        System.out.println(daysOfWeek);
    }
}
