package methodchain;

public class ModifiedWord {

    private String word;

    public String modify(String word) {
        this.word = word;
        return toUpper().secondCharToX().fourthCharToY().getWord();
    }

    public String getWord() {
        return word;
    }

    private ModifiedWord toUpper() {
        word = word.toUpperCase().substring(0, 4);
        return this;
    }

    private ModifiedWord secondCharToX() {
        word = word.substring(0, 1).concat("x").concat(word.substring(2, 4));
        return this;
    }

    private ModifiedWord fourthCharToY() {
        word = word.substring(0, 3).concat("y");
        return this;
    }
}
