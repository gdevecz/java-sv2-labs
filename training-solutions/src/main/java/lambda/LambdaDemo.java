package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaDemo {

    public static void main(String[] args) {
        new LambdaDemo().useStreams();
    }

    private void useStreams() {
        List<String> names = new ArrayList<>(Arrays.asList("John Doe", "Jack Doe", "Jane Doe"));

//        for (String name : names) {
//            System.out.println(name);
//        }

//        names.forEach((String name) -> { System.out.println(name); });
//        names.forEach(name -> System.out.println(name));
//        names.forEach(System.out::println);

//        names.replaceAll(name -> { return name.toUpperCase(); });
//        names.replaceAll(name-> name.toUpperCase());
//        names.replaceAll(String::toUpperCase);
//        System.out.println(names);

//        names.replaceAll(name -> toFirstCaracters(name));
//        names.replaceAll(this::toFirstCaracters);
//        System.out.println(names);

//        names.removeIf((String name) -> {return name.startsWith("Jane");});
//        names.removeIf(name -> {return name.startsWith("Jane");});
        names.removeIf(name -> name.startsWith("Jane"));
    }

    private String toFirstCaracters(String textt) {
        return textt.substring(0, 2);
    }
}
