package primitivetypes.exam;

import java.time.LocalDate;

public class Person {

    private String name;

    private LocalDate birthOfDay;

    private int postcode;

    private double averageRating;

    public Person(String name, LocalDate birthOfDay, int postcode, double averageRating) {
        this.name = name;
        this.birthOfDay = birthOfDay;
        this.postcode = postcode;
        this.averageRating = averageRating;
    }

    @Override
    public String toString() {
        return name + ", született: " + birthOfDay + ", ir. szám: " + postcode + ", tanulmányi átlaga: "  + averageRating;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthOfDay() {
        return birthOfDay;
    }

    public int getPostcode() {
        return postcode;
    }

    public double getAverageRating() {
        return averageRating;
    }
}
