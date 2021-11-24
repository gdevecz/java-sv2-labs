package algorithmsfilter.zoo;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    private List<Animal> animals;

    public Zoo(List<Animal> animals) {
        this.animals = animals;
    }

    public void addAnimal(Animal newAnimal) {
        animals.add(newAnimal);
    }

    public List<Animal> getAnimalsWithNumberOfLegsGiven(int numberOfLegs) {
        List<Animal> result = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal.getNumberOfLegs() == numberOfLegs) {
                result.add(animal);
            }
        }
        return result;
    }
}
