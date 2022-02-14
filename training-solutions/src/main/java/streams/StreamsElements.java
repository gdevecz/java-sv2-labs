package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Stream;

public class StreamsElements {


    public static void main(String[] args) {
        Stream.of("John", "Jack")
                .forEach(System.out::println);

        Stream.generate(Math::random)
                .limit(10)
                .forEach(System.out::println);

        Stream.iterate(1, n -> n + 2)
                .limit(10)
                .forEach(System.out::println);

        List<String> names = Arrays.asList("John", "Jack");
        names.stream()
                .forEach(System.out::println);

        List<Integer> numbers = Arrays.asList(5, 8, 2, 3, 10, 8, 15, 1, 18);

//        long count = numbers.stream()
        OptionalInt min = numbers.stream()
                .mapToInt(i -> i)
                .filter(n -> n < 10)
                .distinct()
                .map(n -> n + 10)
                .sorted()
                .peek(System.out::println)
//                .forEach(System.out::println);
//                .count();
                .min();

        System.out.println(min);
    }
}
