package collectionslist;

import java.util.ArrayList;
import java.util.List;

public class Postman {

    private List<String> addresses = new ArrayList<>();

    public void addAddress(String newAddress) {
        addresses.add(newAddress);
    }

    public void removeAddress(String address) {
        addresses.remove(address);
    }

    public List<String> getAddress() {
        return addresses;
    }

    public List<String> getAddresses() {
        return addresses;
    }
}
