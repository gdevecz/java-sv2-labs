package algorithmsmax;

public class Plane {

    public int getLongestOcean(String map) {
        int max = 0;
        int i = 0;
        while (i < map.length()) {
            if (map.charAt(i) == '0') {
                int nextIndex = getNextChange(map, i, '0');
                max = getLonger(max, nextIndex - i);
                i = nextIndex;
            }
            if (map.charAt(i) == '1') {
                i = getNextChange(map, i, '1');
            }
        }
        return max;
    }

    private int getNextChange(String map, int startIndex, char pattern) {
        int index = startIndex;
        while (index < map.length() && map.charAt(index++) == pattern)
            ;
        return index;
    }

    private int getLonger(int max, int localMax) {
        return localMax > max ? localMax : max;
    }
}
