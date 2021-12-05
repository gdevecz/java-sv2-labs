package inheritanceattributes.book;

public class Book {

    private String title;

    protected int price;

    public Book(String title, int price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public int purchase(int pieces) {// kiszámolja a darabszám ismeretében a teljes árat
        return pieces * price;
    }
}
