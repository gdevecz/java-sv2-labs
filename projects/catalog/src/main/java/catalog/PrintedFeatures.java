package catalog;

import java.util.List;

public class PrintedFeatures implements Feature {

    private List<String> authors;

    private int numberOfPages;

    private String title;

    public PrintedFeatures(String title, int numberOfPages, List<String> authors) {
        if (Validators.isBlank(title)) {
            throw new IllegalArgumentException("Empty title");
        }
        if (numberOfPages < 0) {
            throw new IllegalArgumentException("Length can not be negative.");
        }
        if (Validators.isEmpty(authors)) {
            throw new IllegalArgumentException("Empty authors");
        }
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.authors = authors;
    }

    @Override
    public List<String> getContributors() {
        return List.copyOf(authors);
    }

    @Override
    public String getTitle() {
        String result = title;
        return result;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }
}
