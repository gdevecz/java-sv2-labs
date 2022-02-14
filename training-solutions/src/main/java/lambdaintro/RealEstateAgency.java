package lambdaintro;

import java.util.List;
import java.util.function.Predicate;

public class RealEstateAgency {

    private List<Flat> flats;

    public RealEstateAgency(List<Flat> flats) {
        this.flats = flats;
    }

    public Flat findFirstCheaperFlat(int maxPrice) {
        return findFirst(f -> f.getPrice() < maxPrice);
    }


    public Flat findFirstGreaterFlat(double area) {
        return findFirst(f -> f.getArea() > area);
    }

    public List<Flat> getFlats() {
        return flats;
    }

    public Flat findFirstFlatInSameTown(String town) {
        return findFirst(f -> f.getAddress().startsWith(town));
    }

    private Flat findFirst(Predicate<Flat> condition) {
        for (Flat flat : flats) {
            if (condition.test(flat)) {
                return flat;
            }
        }
        throw new IllegalArgumentException("No such flat.");
    }
}
