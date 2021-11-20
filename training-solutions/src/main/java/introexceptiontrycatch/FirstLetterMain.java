package introexceptiontrycatch;

import introexceptiontrace.aquarium.Fish;

import java.util.ArrayList;

public class FirstLetterMain {

    public static void main(String[] args) {

        FirstLetter fl = new FirstLetter();

//        nullpointer, nincs lista
//        fl.printFirstLetters();

        fl.setWords(new ArrayList<>());
//        fl.printFirstLetters();

//        nullpointer, nincs szó
//        fl.addWord(null);
//        fl.printFirstLetters();

//        indexoutofbond, üres a word
        fl.addWord("word");
        fl.addWord("");
//        fl.addWord(null);
        fl.printFirstLetters();
    }
}
