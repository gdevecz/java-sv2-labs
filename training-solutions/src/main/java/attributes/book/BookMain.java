package attributes.book;

public class BookMain {

    public static void main(String[] args) {
        Book book = new Book("Piszkos Fred a kapitány");

        System.out.println(book.getTitle());
        book.setTitle("Előretolt helyőrség");
        System.out.println(book.getTitle());
    }
}
