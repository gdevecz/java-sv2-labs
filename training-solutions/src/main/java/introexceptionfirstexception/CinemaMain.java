package introexceptionfirstexception;

public class CinemaMain {

    public static void main(String[] args) {
        Cinema cinema = new Cinema("Mozi");

        cinema.addPerformance(new Performance("Titanic"));


        cinema.buyTickets();


    }
}
