package clone.issuetracker;

import java.time.LocalDateTime;

public class Comment {

    private String text;

    private LocalDateTime time;

    public Comment(String text, LocalDateTime time) {
        this.text = text;
        this.time = time;
    }

    public Comment(Comment another) {
        text = another.text;
        time = another.time;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDateTime getTime() {
        return time;
    }
}
