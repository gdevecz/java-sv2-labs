package optional;

import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) {
        Optional<String> unknown = Optional.empty();
        System.out.println(unknown);

        Optional<String> john = Optional.of("John");
        System.out.println(john);

        if (john.isPresent()) {
            System.out.println(john.get());
        }

//        unknown.get();  java.util.NoSuchElementException

//        String name = unknown.orElse("Jack");
//        System.out.println(name);

//        String name = unknown.orElseThrow(() -> new IllegalArgumentException("Unknown"));
        String name = john.orElseThrow(() -> new IllegalArgumentException("Unknown"));
        System.out.println(name);
    }
}
