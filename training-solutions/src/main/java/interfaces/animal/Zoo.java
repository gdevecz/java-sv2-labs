package interfaces.animal;

import java.util.List;

public class Zoo {

    private List<Animal> animals;

    public Zoo(List<Animal> animals) {
        this.animals = animals;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public int getNumberOfAnimals() {
        return animals.size();
    }

    public int getNumberOfAllLegs() {
        int sumOfLegs = 0;
        for (Animal animal : animals) {
            sumOfLegs+=animal.getNumberOfLegs();
        }
        return sumOfLegs;
    }
}
