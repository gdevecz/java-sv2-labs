package collectionsclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Lottery {

    public List<Integer> selectWinningNumbers(int lotteryType, int ballCount){
        if (ballCount <= lotteryType) {
            throw new IllegalArgumentException("There must be more balls than the winning numbers!");
        }
        List<Integer> pool = new LinkedList<>();
        for (int i = 1; i <= ballCount; i++) {
            pool.add(i);
        }
        Collections.shuffle(pool);
        List<Integer> result = pool.subList(0, lotteryType);
        Collections.sort(result);
        return result;
    }
}
