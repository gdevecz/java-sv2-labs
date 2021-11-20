package introexceptiontrycatch;

import java.util.List;

public class FirstLetter {

    private List<String> words;


    public void addWord(String word) {
        words.add(word);
    }

    public List<String> getWords() {
        return words;
    }

    public void setWords(List<String> words) {
        this.words = words;
    }

    public void printFirstLetters() {
        try {
            for (String word : words) {
                System.out.println(word.charAt(0));
            }
        } catch (NullPointerException npe) {
            System.out.println(words == null ? "A lista nincs létrehozva" : "Az aktuális szó null");
            System.out.println(npe.getMessage());
            npe.printStackTrace();
        } catch (IndexOutOfBoundsException ioobe) {
            System.out.println("A string üres!");
            System.out.println(ioobe.getMessage());
            ioobe.printStackTrace();
        }
    }
}