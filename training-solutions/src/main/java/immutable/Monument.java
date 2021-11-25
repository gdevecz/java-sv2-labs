package immutable;

import java.time.LocalDate;

public class Monument {

    private final String name;

    private final String address;

    private final LocalDate dateOfRegistry;

    private final String registryNumber;

    public Monument(String name, String title, LocalDate dateOfRegistration, String registrationNumber) {
        if (!isInputValid(name, title, registrationNumber)) {
            throw new IllegalArgumentException("Name, address or registry number cannot be empty!");
        }
        this.name = name;
        this.address = title;
        this.dateOfRegistry = dateOfRegistration;
        this.registryNumber = registrationNumber;

    }

    private boolean isInputValid(String name, String title, String registrationNumber) {
        return isEmpty(name)
                && isEmpty(title)
                && isEmpty(registrationNumber);
    }

    private boolean isEmpty(String text) {
        if (text == null) {

        }
        if (text.isBlank()) {
            throw new IllegalArgumentException("Input is null");
        }
        return true;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public LocalDate getDateOfRegistry() {
        return dateOfRegistry;
    }

    public String getRegistryNumber() {
        return registryNumber;
    }
}
