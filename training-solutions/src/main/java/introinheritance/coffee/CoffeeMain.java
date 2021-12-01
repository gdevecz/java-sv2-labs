package introinheritance.coffee;

public class CoffeeMain {

    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        coffee.setName("Kávé");
        coffee.setPrice(123);

        System.out.println(coffee.getName()+", "+coffee.getPrice());

        Capuccino capuccino = new Capuccino();
        capuccino.setName("Capuccino");
        capuccino.setPrice(321);
        System.out.println(capuccino.getName()+", "+capuccino.getPrice());
    }
}
