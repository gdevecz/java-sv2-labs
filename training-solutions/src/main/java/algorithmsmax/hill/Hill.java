package algorithmsmax.hill;

import java.util.List;

public class Hill {

    public int getMax(List<Integer> heights) {
        int max = heights.get(0);
        for (int heigth : heights) {
            if (heigth > max) {
                max = heigth;
            }
        }
        return max;
    }
}
