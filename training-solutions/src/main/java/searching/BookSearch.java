package searching;

import java.util.Collections;
import java.util.List;

public class BookSearch {

    private List<Book> books;

    public BookSearch(List<Book> books) {
        this.books = books;
    }

    public searching.Book findBookByAuthorTitle(String author, String title) {
        if (author == null || title == null || author.isBlank() || title.isBlank()) {
            throw new IllegalArgumentException("Author or title must not be empty!");
        }
        int index = Collections.binarySearch(books, new Book(author, title));
        if (index < 0) {
            throw new IllegalArgumentException("No book found by " + author + " with title " + title);
        }
        System.out.println(books.get(index));
        return books.get(index);
    }

    public List<Book> getBooks() {
        return books;
    }
}
