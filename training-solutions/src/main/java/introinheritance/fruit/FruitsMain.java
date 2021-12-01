package introinheritance.fruit;

public class FruitsMain {

    public static void main(String[] args) {
        Fruit fruit = new Fruit();
        fruit.setName("Gyümölcs");
        fruit.setWeight(23.1);
        System.out.println(fruit.getName() + ", " + fruit.getWeight());

        Grape grape = new Grape();
        grape.setName("szőlő");
        grape.setWeight(12.3);
        grape.setType("irsai olivér");
        System.out.println(grape.getName() + ", " + grape.getWeight() + ", " + grape.getType());

        Apple apple = new Apple();
        apple.setName("alma");
        apple.setWeight(13.2);
        apple.setPieces(10);
        System.out.println(apple.getName() + ", " + apple.getWeight() + ", " + apple.getPieces());

        GoldenDelicious goldenDelicious = new GoldenDelicious();
        goldenDelicious.setName("alma");
        goldenDelicious.setWeight(43.2);
        goldenDelicious.setPieces(11);
        System.out.println(goldenDelicious.getName() + ", " + goldenDelicious.getWeight()
                + ", " + goldenDelicious.getPieces() + ", " + goldenDelicious.getColour());

        Starking starking = new Starking();
        starking.setName("alma");
        starking.setWeight(32.3);
        starking.setPieces(22);
        System.out.println(starking.getName() + ", " + starking.getWeight() + ", " + starking.getPieces()
                + ", " + starking.getColour());
    }
}
