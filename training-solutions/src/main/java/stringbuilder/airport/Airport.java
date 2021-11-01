package stringbuilder.airport;

import java.util.ArrayList;
import java.util.List;

public class Airport {

    private List<Flight> flights = new ArrayList<>();

    public void addFlight(Flight flight) {
        flights.add(flight);
    }

    public String getDeletedFlights() {
        StringBuilder sb = new StringBuilder("Törölt járatok");
        for (Flight flight : flights) {
            if(flight.getStatus() == Status.DELETED) {
                sb.append("\n").append(flight.getFlightNumber());
            }
        }
        return sb.toString();
    }

    public List<Flight> getFlights() {
        return flights;
    }
}
