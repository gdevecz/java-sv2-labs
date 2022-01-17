package catalog;

import java.util.ArrayList;
import java.util.List;

public class Catalog {

    List<CatalogItem> catalogItems = new ArrayList<>();

    public void addItem(CatalogItem newCatalogItem) {
        catalogItems.add(newCatalogItem);
    }

    public double averagePageNumberOver(int limit) {
        if (limit < 1) {
            throw new IllegalArgumentException("Page number must be positive");
        }
        int sum = 0;
        int counter = 0;
        List<CatalogItem> tmp = getPrintedLibraryItems();
        if (tmp.isEmpty()) {
            throw new IllegalArgumentException("No page");
        }
        for (CatalogItem catalogItem : tmp) {
            if (catalogItem.hasPrintedFeature() && catalogItem.numberOfPagesAtOneItem() > limit) {
                counter++;
                sum += catalogItem.numberOfPagesAtOneItem();
            }
        }
        if (counter == 0) {
            throw new IllegalArgumentException("No page");
        }
        return sum / (double) counter;
    }

    public void deleteItemByRegistrationNumber(String registrationNumber) {
        catalogItems.remove(getItemByRegistrationNumber(registrationNumber));
    }

    public List<CatalogItem> findByCriteria(SearchCriteria searchCriteria) {
        List<CatalogItem> result = new ArrayList<>();
        for (CatalogItem catalogItem : catalogItems) {
            if (isInActual(searchCriteria, catalogItem)) {
                result.add(catalogItem);
            }
        }
        return result;
    }

    public int getAllPageNumber() {
        int sum = 0;
        for (CatalogItem catalogItem : getPrintedLibraryItems()) {
            sum += catalogItem.numberOfPagesAtOneItem();
        }
        return sum;
    }

    public List<CatalogItem> getAudioLibraryItems() {
        List<CatalogItem> result = new ArrayList<>();
        for (CatalogItem catalogItem : catalogItems) {
            if (catalogItem.hasAudioFeature())
                result.add(catalogItem);
        }
        return result;
    }

    public int getFullLength() {
        List<CatalogItem> tmp = getAudioLibraryItems();
        int sum = 0;
        for (CatalogItem catalogItem : tmp) {
            sum += catalogItem.fullLengthAtOneItem();
        }
        return sum;
    }

    public List<CatalogItem> getPrintedLibraryItems() {
        List<CatalogItem> result = new ArrayList<>();
        for (CatalogItem catalogItem : catalogItems) {
            if (catalogItem.hasPrintedFeature())
                result.add(catalogItem);
        }
        return result;
    }

    private CatalogItem getItemByRegistrationNumber(String registrationNumber) {
        for (CatalogItem catalogItem : catalogItems) {
            if (catalogItem.getRegistrationNumber().equals(registrationNumber)) {
                return catalogItem;
            }
        }
        throw new IllegalArgumentException("This registration number is not exits.");
    }

    private boolean isInActual(SearchCriteria searchCriteria, CatalogItem catalogItem) {
        for (Feature feature : catalogItem.getFeatures()) {
            if (isFoundItem(searchCriteria, feature)) {
                return true;
            }
        }
        return false;
    }

    private boolean isFoundItem(SearchCriteria searchCriteria, Feature feature) {
        boolean contributorIsEquals = false;
        boolean titleIsEquals = false;
        if (searchCriteria.hasContributor()) {
            contributorIsEquals = feature.getContributors().contains(searchCriteria.getContributor());
        }
        if (searchCriteria.hasTitle()) {
            titleIsEquals = feature.getTitle().equals(searchCriteria.getTitle());
        }
        return resultFindCriteria(searchCriteria, contributorIsEquals, titleIsEquals);
    }

    private boolean resultFindCriteria(SearchCriteria searchCriteria, boolean contributorIsEquals, boolean titleIsEquals) {
        if (searchCriteria.hasTitle() && searchCriteria.hasContributor()) {
            return contributorIsEquals && titleIsEquals;
        } else if (searchCriteria.hasContributor()) {
            return contributorIsEquals;
        } else if (searchCriteria.hasTitle()) {
            return titleIsEquals;
        }
        return false;
    }
}