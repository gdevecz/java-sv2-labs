package references.dogs;

import java.util.ArrayList;
import java.util.List;

public class Kennel {

    public static void main(String[] args) {

        List<Dog> dogs = new ArrayList<>();
        // it a lista már létezik, nem null, de még nincs egy eleme sem. (size() == 0)

        Dog firstDog = new Dog("Vahúr", 10, "brown");
        Dog secondDog = new Dog("Rex", 5, "multicolored");
        Dog thirdDog = new Dog("Mirnixdirnix", 7, "white");
        dogs.add(firstDog);
        dogs.add(secondDog);
        dogs.add(thirdDog);

        System.out.println("Az elemek száma: " + dogs.size());
        for (Dog dog : dogs) {
            System.out.println(dog);
        }

        Dog fourthDog = dogs.get(1);
        fourthDog.setColour("blue"); //mivel u.a példány, így Rex színe kék lett, akár hogy is hívatkozok rá

        System.out.println();
        System.out.println("Az elemek száma: " + dogs.size());
        for (Dog dog : dogs) {
            System.out.println(dog);    // a 0. és 3. indexen ugyan úgy a kék Rex példánya van
        }

        Dog fifthDog = new Dog("Cukorfalat", 9, "black");
        System.out.println();
        System.out.println(fifthDog);

        fifthDog = dogs.get(1);    // Cukorfalat véglegesen elveszett eredetije elveszett, most ő is Rex;
        System.out.println(fifthDog);

        dogs.add(fifthDog);  // Rex példánya redundánsan újra hozzáadva a listához
        System.out.println();
        System.out.println("Az elemek száma: " + dogs.size());
        for (Dog dog : dogs) {
            System.out.println(dog);
        }

        Dog sixthDog = fourthDog;
        sixthDog.setColour("pink"); // REx kéről rózsaszín lett

        System.out.println("Az elemek száma: " + dogs.size());
        for (Dog dog : dogs) {
            System.out.println(dog);
        }

        List<Dog> anotherDogs = dogs;

        Dog seventhDog = fourthDog;
        seventhDog.setColour("yellow"); // rex besárgult

        System.out.println();
        System.out.println("Az 2. lista elemeinek száma: " + anotherDogs.size());
        for (Dog dog : anotherDogs) {
            System.out.println(dog);
        }

        secondDog.setColour("green");
        System.out.println();
        System.out.println("Az 2. lista elemeinek száma: " + anotherDogs.size());
        for (Dog dog : anotherDogs) {
            System.out.println(dog);
        }

        secondDog = null;
        System.out.println();
        System.out.println("Az 2. lista elemeinek száma: " + anotherDogs.size());
        for (Dog dog : anotherDogs) {
            System.out.println(dog);
        }

        Dog eighthDog = dogs.get(1); //ismét csak rex;
        eighthDog = null; // rex él csak nem eightDog néven nem elérhető, ott most nincs senki

        Dog ninthDog = dogs.get(1);
        ninthDog    .setColour("azure"); //rexre ismét ráesett egy festékesdoboz
        System.out.println();
        System.out.println("Az 2. lista elemeinek száma: " + anotherDogs.size());
        for (Dog dog : anotherDogs) {
            System.out.println(dog);
        }

        //Szegény rexet többször átfestették és kétszer felvezették ugyan arra a
        //listára (más-más törzskönyvvel, amikben mindig korrigálták a színét)
    }
}
