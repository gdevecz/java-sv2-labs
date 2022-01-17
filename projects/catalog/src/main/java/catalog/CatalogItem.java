package catalog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CatalogItem {

    private List<Feature> features = new ArrayList<>();

    private int price;

    private String registrationNumber;

    public CatalogItem(String registrationNumber, int price, Feature... feature) {
        if (Validators.isBlank(registrationNumber)) {
            throw new IllegalArgumentException("Registration number is empty.");
        }
        if (feature.length == 0) {
            throw new IllegalArgumentException("Feature is empty.");
        }
        this.registrationNumber = registrationNumber;
        this.price = price;
        features.addAll(Arrays.asList(feature));
    }

    public int fullLengthAtOneItem() {
        int sum = 0;
        for (Feature feature : features) {
            sum += feature instanceof AudioFeatures ? ((AudioFeatures) feature).getLength() : 0;
        }
        return sum;
    }

    public List<String> getContributors() {
        List<String> result = new ArrayList<>();
        for (Feature feature : features) {
            result.addAll(feature.getContributors());
        }
        return result;
    }

    public List<String> getTitles() {
        List<String> result = new ArrayList<>();
        for (Feature feature : features) {
            result.add(feature.getTitle());
        }
        return result;
    }

    public boolean hasAudioFeature() {
        for (Feature feature : features) {
            if (feature instanceof AudioFeatures) {
                return true;
            }
        }
        return false;
    }

    public boolean hasPrintedFeature() {
        for (Feature feature : features) {
            if (feature instanceof PrintedFeatures) {
                return true;
            }
        }
        return false;
    }

    public int numberOfPagesAtOneItem() {
        int sum = 0;
        for (Feature feature : features) {
            sum += feature instanceof PrintedFeatures ? ((PrintedFeatures) feature).getNumberOfPages() : 0;
        }
        return sum;
    }

    public List<Feature> getFeatures() {
        return features;
    }

    public int getPrice() {
        return price;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }
}
