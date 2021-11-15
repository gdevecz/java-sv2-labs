package introexceptionfirstexception;

import java.util.List;

public class CinemaMain {

    public static void main(String[] args) {
        Cinema cinema = new Cinema("Mozi");

        cinema.addPerformance(new Performance("Titanic"));


        cinema.buyTickets();
        List<Ticket> customerTickets = cinema.getCustomerTickets("walaki","Tittanicc");
        System.out.println(customerTickets);

    }
}
