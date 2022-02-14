package lambdastreams.bookstore;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class BookStore {

    private List<Book> books;

    public BookStore(List<Book> books) {
        this.books = books;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public Integer getNumberOfBooks() {
        return (int) books.stream()
                .reduce(0, (n, b) -> n + b.getQuantity(), (n1, n2) -> n1 + n2);
    }

    public Optional<Book> findNewestBook() {
        return books.stream()
                .max(Comparator.comparingInt(Book::getYearOfPublish));
    }

    public Integer getTotalValue() {
        return books.stream()
                .reduce(0, (p, e) -> p + e.getPrice() * e.getQuantity(), (p1, p2) -> p1 + p2);
    }
}
