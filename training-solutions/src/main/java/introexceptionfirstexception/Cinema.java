package introexceptionfirstexception;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cinema {

    private String title;

    private List<Performance> performances = new ArrayList<>();

    public Cinema(String title) {
        this.title = title;
    }

    public void addPerformance(Performance performance) {
        performances.add(performance);
    }

    public String getTitle() {
        return title;
    }

    public List<Performance> getPerformances() {
        return performances;
    }

    public void setPerformances(List<Performance> performances) {
        this.performances = performances;
    }

    public void buyTickets() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérem az adatokat");
        System.out.print("Vásárló neve: ");
        String name = sc.nextLine();
        System.out.print("Film címe: ");
        String title = sc.nextLine();
        System.out.print("Vásárolni kívánt jegyek száma: ");
        int quantityOfTickets = Integer.parseInt(sc.nextLine());
        System.out.print("Hányadik sorba: ");
        int row = Integer.parseInt(sc.nextLine());

        for (Performance performance : performances) {
            if (performance.getTitle().equalsIgnoreCase(title)) {
                for (int i = 0; i < quantityOfTickets; i++) {
                    performance.addTicket(new Ticket(name, row, i));
                }
            }

        }
    }

    public List<Ticket> getCustomerTickets(String customer, String movie) {
        for(Performance performance : performances) {
            if(performance.getTitle().equalsIgnoreCase(movie)) {
                return (performance.customerTickets(customer));
            }
        }
        return  null;
    }
}