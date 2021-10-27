package compositionlist;

import java.util.ArrayList;
import java.util.List;

public class Books {

    private List<String> books = new ArrayList<>();

    public void addBook(String title) {
        books.add(title);
    }

    public void findBookAndSetAuthor(String title, String author) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).equals(title)) {
                books.set(i, author + ": " + books.get(i));
            }
        }
    }

    public List<String> getBooks() {
        return books;
    }
}
