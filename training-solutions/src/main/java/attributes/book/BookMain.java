package attributes.book;

public class BookMain {

    public static void main(String[] args) {
        Book book = new Book("Piszkos Fred a kapitány");
        Book anotherBook = new Book("Galaxis útikalauz stopposoknak");
        System.out.println(book.getTitle());
        book.setTitle("Előretolt helyőrség");
        System.out.println(book.getTitle());
        System.out.println(anotherBook.getTitle());
        anotherBook.setTitle("Az Élet, a Világmindenség meg Minden");
        System.out.println(anotherBook.getTitle());
    }
}
