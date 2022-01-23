package collectionsautoboxing;

import java.util.HashMap;
import java.util.Map;

public class Paper {

    Map<String, Integer> paper = new HashMap<>();

    public void putFurtherPaper(String className, int kilograms) {
        if (kilograms == 0) {
            return;
        }
        if (!paper.containsKey(className)) {
            paper.put(className, kilograms);
        } else {
            paper.put(className, paper.get(className) + kilograms);
        }
    }

    public String getWinnerClass() {
        String result = "";
        int max = Integer.MIN_VALUE;
        for (String item : paper.keySet()) {
            if (paper.get(item) > max) {
                max = paper.get(item);
                result = item;
            }
        }
        return result;
    }

    public int getTotalWeight() {
        int sum = 0;
        for (int item : paper.values()) {
            sum += item;
        }
        return sum;
    }

    public Map<String, Integer> getPaper() {
        return paper;
    }
}
