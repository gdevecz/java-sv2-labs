package catalog;

import java.util.ArrayList;
import java.util.List;

public class AudioFeatures implements Feature {

    private List<String> composer = new ArrayList<>();

    private int length;

    private List<String> performers = new ArrayList<>();

    private String title;

    public AudioFeatures(String title, int length, List<String> performers) {
        if (Validators.isBlank(title)) {
            throw new IllegalArgumentException("Empty title");
        }
        if (length < 0) {
            throw new IllegalArgumentException("Length can not be negative.");
        }
        if (Validators.isEmpty(performers)) {
            throw new IllegalArgumentException("Empty performers");
        }
        this.length = length;
        this.performers.addAll(List.copyOf(performers));
        this.title = title;
    }

    public AudioFeatures(String title, int length, List<String> performers, List<String> composer) {
        this(title, length, performers);
        this.composer.addAll(List.copyOf(composer));
    }

    @Override
    public List<String> getContributors() {
        List<String> result = new ArrayList<>(composer);
        result.addAll(performers);
        return List.copyOf(result);
    }

    @Override
    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }
}
