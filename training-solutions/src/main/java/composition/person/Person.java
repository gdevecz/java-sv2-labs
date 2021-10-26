package composition.person;

public class Person {

    private String name;

    private String identificationCard;

    private Address address;

    public Person(String name, String identificationCard) {
        correctData(name, identificationCard);
    }

    public void correctData(String name, String identificationCard) {
        this.name = name;
        this.identificationCard = identificationCard;
    }

    public void moveTo(Address address) {
        this.address = address;
    }

    public String personToString() {
        return "name: " + name + ", id: " + identificationCard +
                ((address != null)
                        ? ("\nLakhely: " + address.addressToString())
                        : "");
    }

    public Address getAddress() {
        return address;
    }
}
