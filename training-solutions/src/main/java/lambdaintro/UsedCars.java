package lambdaintro;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class UsedCars {

    private List<Car> usedCars;

    public UsedCars(List<Car> usedCars) {
        this.usedCars = usedCars;
    }

    public List<Car> listCarsByPrice() {
//        return usedCars.stream()
//                .sorted(Comparator.comparing(Car::getPrice))
//                .toList();
        ArrayList<Car> result = new ArrayList<>(usedCars);
        result.sort(Comparator.comparingInt(Car::getPrice));
        return result;
    }

    public List<Car> listCarsByLengthDesc() {
//        return usedCars.stream()
//                .sorted(Comparator.comparing(Car::getLength).reversed())
//                .toList();
        ArrayList<Car> result = new ArrayList<>(usedCars);
        result.sort(Comparator.comparingDouble(Car::getLength).reversed());
        return result;
    }

    public List<Car> listCarsOneBrandByType(String brand) {
//        return usedCars.stream()
//                .filter(c -> c.getBrand().equals(brand))
//                .sorted(Comparator.comparing(Car::getType))
//                .toList();
        ArrayList<Car> result = new ArrayList<>(usedCars);
        result.removeIf(e->!e.getBrand().equals(brand));
        result.sort(Comparator.comparing(Car::getType));
        return result;
    }

    public List<Car> getUsedCars() {
        return usedCars;
    }
}
