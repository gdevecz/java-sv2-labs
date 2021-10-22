package math.random;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomDraw {

    public static void main(String[] args) {
        RandomDraw randomDraw = new RandomDraw();
        List<String> people = new ArrayList<>();
        int indexA;
        int indexB;

        people.add("Kovács Elemér");
        people.add("Vladimir Iljics Abdullah");
        people.add("Uhrin Benedek");
        people.add("Bor Ivó");
        people.add("Megegy Elek");
        people.add("Kovács Isván");
        people.add("Fülig Jimmy");
        people.add("Netuddky");
        people.add("Dagályos Morrogh");
        people.add("Zaphod Beeblebrox");

        Random rnd = new Random();
        indexA = rnd.nextInt(5);
        indexB = rnd.nextInt(5) + 5;
        System.out.println(people.get(indexA));
        System.out.println(people.get(indexB));
    }
}
