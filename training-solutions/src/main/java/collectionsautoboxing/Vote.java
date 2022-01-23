package collectionsautoboxing;

import java.util.HashMap;
import java.util.Map;

public class Vote {

    public Map<VoteResult, Integer> getResult(Map<String, VoteResult> votes) {
        Map<VoteResult, Integer> result = new HashMap<>();
        result.put(VoteResult.YES, 0);
        result.put(VoteResult.NO, 0);
        result.put(VoteResult.ABSTAIN, 0);
        for (VoteResult item : votes.values()) {
            result.put(item, result.get(item) + 1);
        }
        return result;
    }
}
