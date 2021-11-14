package introexceptionfirstexception;

public class Ticket {

    private String customer;

    private int row;

    private int column;

    public Ticket(String customer, int row, int column) {
        this.customer = customer;
        this.row = row;
        this.column = column;
    }

    public String getCustomer() {
        return customer;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }
}
