package introexceptionfirstexception;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Performance {

    private String title;

    private List<Ticket> tickets = new ArrayList<>();

    public Performance(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public List<Ticket> customerTickets(String customer) {
        List<Ticket> result = new ArrayList<>();

        for (Ticket ticket : tickets) {
            if (ticket.getCustomer().equalsIgnoreCase(customer)) {
                result.add(ticket);
            }
        }
        return result;
    }

    public void addTicket(Ticket ticket) {
        tickets.add(ticket);
    }

    public List<Ticket> getCustomerTickets(String customer) {
        List<Ticket> result = new ArrayList<>();

        for (Ticket ticket : tickets) {
            result.add(ticket);
        }
        return result;
    }
}
