package interfacedependencyinversion;

public class CourierCompany {

    public static void main(String[] args) {
        Box smallBox = new SmallBox();
        System.out.println(smallBox.getSize() + ": " + smallBox.getPrice());

        Box mediumBox = new MediumBox();
        System.out.println(mediumBox.getSize() + ": " + mediumBox.getPrice());

        Box largeBox = new LargeBox();
        System.out.println(largeBox.getSize() + ": " + largeBox.getPrice());

        Box extraLargeBox = new ExtraLargaBox();
        System.out.println(extraLargeBox.getSize() + ": " + extraLargeBox.getPrice());
    }
}
