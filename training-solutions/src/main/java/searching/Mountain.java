package searching;

import java.util.Arrays;
import java.util.Collections;

public class Mountain {

    private int[] heights;

    public Mountain(int[] heights) {
        this.heights = heights;
    }

    public boolean searchPeak(Peak peak) {
        int result = Arrays.binarySearch(heights, peak.getHeight());
        return result >= 0;
    }
}
