package catalog;

public class SearchCriteria {

    private String contributor;

    private String title;

    private SearchCriteria(String contributor, String title) {
        this.contributor = contributor;
        this.title = title;
    }

    public static SearchCriteria createByBoth (String contributor, String title) {
        if (Validators.isBlank(contributor)) {
            throw new IllegalArgumentException("Contributor is empty");
        }
        if (Validators.isBlank(title)) {
            throw new IllegalArgumentException("Title is empty");
        }
        return new SearchCriteria(contributor, title);
    }

    public static SearchCriteria createByContributor(String contributor) {
        if (Validators.isBlank(contributor)) {
            throw new IllegalArgumentException("Contributor is empty");
        }
        return new SearchCriteria(contributor, "");
    }

    public static SearchCriteria createByTitle(String title) {
        if (Validators.isBlank(title)) {
            throw new IllegalArgumentException("Title is empty");
        }
        return new SearchCriteria("", title);
    }

    public boolean hasContributor() {
        if (contributor.isBlank()) {
            return false;
        }
        return true;
    }

    public boolean hasTitle() {
        if (title.isBlank()) {
            return false;
        }
        return true;
    }

    public String getContributor() {
        String result = contributor;
        return result;
    }

    public String getTitle() {
        String result = title;
        return result;
    }
}
