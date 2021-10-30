package enumtype.firstenum.position;

public class PositionMain {

    public static void main(String[] args) {
        for (Position position : Position.values()) {
            System.out.println("   Pozíció: " + position.name() + "\n" +
                    "       Bér: " + position.getSalary() + "\n" +
                    "Juttatások: " + position.getBenefit() + "\n");
        }
    }
}
