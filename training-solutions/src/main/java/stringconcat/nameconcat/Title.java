package stringconcat.nameconcat;

public enum Title {
    MR("Mr."), MRS("Mrs."), MS("Ms."), DR("Dr.");

    private final String text;

    Title(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
