package classstructureconstructors;

public class BookMain {

    public static void main(String[] args) {

        Book book = new Book("Rejtő Jenő", "Előretolt helyőrség");
        book.register("RJ012");

        System.out.println("The book: ");
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Title: " + book.getTitle());
        System.out.println("Registration number: " + book.getRegNumber());
    }
}
