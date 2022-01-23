package collectionsmap;

import java.util.Map;

public class Casting {

    public String callNextApplicant(int lastNumber, Map<Integer, String> applicants) {
        int result = Integer.MAX_VALUE;
        for (Integer item : applicants.keySet()) {
            if (lastNumber < item && result>item) {
                result=item;
            }
        }
        return applicants.get(result);
    }
}
