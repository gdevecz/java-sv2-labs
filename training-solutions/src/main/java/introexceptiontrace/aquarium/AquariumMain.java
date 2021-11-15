package introexceptiontrace.aquarium;

public class AquariumMain {
    public static void main(String[] args) {
        Aquarium aquarium = new Aquarium();

        Fish fish1 = new Fish("guppi","szürke");
        Fish fish2 = new Fish("cápa","kék");

        aquarium.addFish(fish1);
        aquarium.addFish(fish2);

        System.out.println(aquarium.getNumberOfFish());
    }
}
