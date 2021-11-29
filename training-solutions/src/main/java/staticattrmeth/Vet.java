package staticattrmeth;

import java.util.ArrayList;
import java.util.List;

public class Vet {

    private List<Dog> dogs = new ArrayList<>();

    private static long code = 0;

    public void addDog(Dog dog) {
        dog.setCode(code++);
        dogs.add(dog);
    }

    public List<Dog> getDogs() {
        return dogs;
    }

    public static long getCode() {
        return code;
    }
}
