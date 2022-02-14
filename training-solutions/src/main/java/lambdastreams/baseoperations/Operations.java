package lambdastreams.baseoperations;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class Operations {

    List<Integer> numbers;

    public Operations(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public Optional<Integer> min() {
        return numbers.stream()
//                .min(Integer::compareTo);
                .min(Comparator.naturalOrder());
    }

    public Integer sum() {
        return numbers.stream()
//                .mapToInt(i -> i)
//                .sum();
                .reduce(0, (c, n) -> c + n, (c1, c2) -> c1 + c2);
    }

    public boolean isAllPositive() {
        return numbers.stream().allMatch(n -> n > 0);
    }

    public Set<Integer> getDistinctElements() {
        return numbers.stream()
                .collect(Collectors.toSet());
    }
}
