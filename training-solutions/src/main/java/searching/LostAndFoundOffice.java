package searching;

import java.util.Collections;
import java.util.List;

public class LostAndFoundOffice {

    private List<LostProperty> properties;

    public LostProperty findLostProperty(LostProperty searched) {
        int index = Collections.binarySearch(properties, searched);
        if (index < 0) {
            throw new IllegalArgumentException("Property not found.");
        }
        return properties.get(index);
    }

    public void addProperty(LostProperty lostProperty) {
        properties.add(lostProperty);
    }

}
