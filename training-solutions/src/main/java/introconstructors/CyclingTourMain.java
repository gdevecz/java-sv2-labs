package introconstructors;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CyclingTourMain {

    public static void main(String[] args) {
        CyclingTour cyclingTour = new CyclingTour("Hegyi túra", LocalDate.of(2022, 4, 12));

        System.out.println("Cycling tour: " + cyclingTour.getDescription());
        //DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
        //System.out.println("Start: " + cyclingTour.getStartTime().format(formatter));
        System.out.println("Start: " + cyclingTour.getStartTime());
        System.out.println("Traveled Km: " + cyclingTour.getKms());
        System.out.println("Number of people: " + cyclingTour.getNumberOfPeople());
        cyclingTour.registerPersons(10);
        cyclingTour.ride(12.3);
        System.out.println("Cycling tour: " + cyclingTour.getDescription());
        System.out.println("Start: " + cyclingTour.getStartTime());
        System.out.println("Traveled Km: " + cyclingTour.getKms());
        System.out.println("Number of people: " + cyclingTour.getNumberOfPeople());

    }
}
