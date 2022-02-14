package streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Read {

    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public List<String> listBookTitlesShorterThanGiven(int maxNumberOfPages) {
        return books.stream()
                .filter(b -> b.getNumberOfPages() <= maxNumberOfPages)
                .map(Book::getTitle)
                .toList();
    }

    public List<String> listBookTitlesWithGivenAuthor(String author) {
        return books.stream()
                .filter(b -> b.getAuthor().equals(author))
                .map(Book::getTitle)
                .sorted()
                .toList();
    }

    public List<String> listAuthors() {
        return books.stream()
                .map(Book::getAuthor)
                .distinct()
                .toList();
    }
}
