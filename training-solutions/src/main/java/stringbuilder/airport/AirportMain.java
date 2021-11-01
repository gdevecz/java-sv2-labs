package stringbuilder.airport;

public class AirportMain {

    public static void main(String[] args) {
        Airport airport = new Airport();
        airport.addFlight(new Flight("B-2351", Status.ACTIVE));
        airport.addFlight(new Flight("N-312561", Status.ACTIVE));
        airport.addFlight(new Flight("S-35", Status.ACTIVE));
        airport.addFlight(new Flight("S-35434235", Status.DELETED));

        System.out.println(airport.getDeletedFlights());

        airport.getFlights().get(1).setStaus(Status.DELETED);
        System.out.println(airport.getDeletedFlights());
    }
}
