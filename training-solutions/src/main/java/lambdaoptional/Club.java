package lambdaoptional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class Club {

    private List<Member> members;

    public Club(List<Member> members) {
        this.members = members;
    }

    public Optional<Member> findFirst(Predicate<Member> predicate) {
        for (Member member : members) {
            if (predicate.test(member)) {
                return Optional.of(member);
            }
        }
        return Optional.empty();
    }

    public Optional<Double> averageNumberOfSkills() {
        if(members.size()==0) {
            return Optional.empty();
        }
        int sum = 0;
        for (Member member : members) {
            sum += member.getSkills().size();
        }
        return Optional.of(sum / (double) members.size());
    }

    public List<Member> getMembers() {
        return members;
    }
}
