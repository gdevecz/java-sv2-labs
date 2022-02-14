package lambdaintro;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class UsedCars {

    List<Car> cars = new ArrayList<>();

    public UsedCars(List<Car> cars) {
        this.cars = cars;
    }

    public List<Car> listCarsByPrice() {
        List<Car> sorted = new ArrayList<>(cars);
//        sorted.sort((car, anothercar) -> Integer.valueOf(car.getPrice()).compareTo(anothercar.getPrice()));
//        sorted.sort((car, anothercar) -> Integer.compare(car.getPrice(), anothercar.getPrice()));
        sorted.sort(Comparator.comparing(Car::getPrice));
        return sorted;
    }

    public List<Car> listCarsByLengthDesc() {
        List<Car> sorted = new ArrayList<>(cars);
        sorted.sort((car, anothercar) -> Double.valueOf(car.getLength()).compareTo(anothercar.getLength()));
        return sorted;
    }

    public List<Car> listCarByPrice() {
        List<Car> sorted = new ArrayList<>(cars);
        sorted.sort((car, anothercar) -> Integer.valueOf(car.getPrice()).compareTo(anothercar.getPrice()));
        return sorted;
    }

    public List<Car> listCarByPrice() {
        List<Car> sorted = new ArrayList<>(cars);
        sorted.sort((car, anothercar) -> Integer.valueOf(car.getPrice()).compareTo(anothercar.getPrice()));
        return sorted;
    }


    public List<Car> getCars() {
        return cars;
    }
}
