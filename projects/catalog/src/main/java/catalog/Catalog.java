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
        List<CatalogItem> tmp = getAudioLibraryItems();
        if (tmp.size()==0) {
            throw new IllegalArgumentException("No page");
        }
        for (CatalogItem catalogItem : tmp) {
            if (catalogItem.hasPrintedFeature()&& catalogItem.numberOfPagesAtOneItem()>limit) {
                sum += catalogItem.numberOfPagesAtOneItem();
            }
        }
        if (sum == 0) {
            throw new IllegalArgumentException("No page");
        }
        return sum / (double) tmp.size();
    }

    public void deleteItemByRegistrationNumber(String registrationNumber) {
        CatalogItem delete = null;
        for (CatalogItem catalogItem : catalogItems) {
            if (catalogItem.getRegistrationNumber().equals(registrationNumber)) {
                delete = catalogItem;
            }
        }
        if (!(delete == null)) {
            catalogItems.remove(delete);
        }
    }

    public List<CatalogItem> findByCriteria(SearchCriteria searchCriteria) {
        List<CatalogItem> result = new ArrayList<>();
        for (CatalogItem catalogItem : catalogItems) {
            for (Feature feature : catalogItem.getFeatures()) {
                if (isFoundItem(searchCriteria, feature)) {
                    result.add(catalogItem);
                }
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
            if(catalogItem.hasAudioFeature())
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
            if(catalogItem.hasPrintedFeature())
                result.add(catalogItem);
        }
        return result;
    }

    private boolean isFoundItem(SearchCriteria searchCriteria, Feature feature) {
        boolean contributorisExists = false;
        boolean titleisExists = false;
        if (searchCriteria.hasContributor()) {
            contributorisExists = feature.getContributors().contains(searchCriteria.getContributor());
        }
        if (searchCriteria.hasTitle()) {
            titleisExists = feature.getTitle().equals(searchCriteria.getTitle());
        }
        if (searchCriteria.hasTitle() && searchCriteria.hasContributor()) {
            if (contributorisExists && titleisExists) {
                return true;
            }
        } else if (searchCriteria.hasContributor()) {
            if (contributorisExists) {
                return true;
            }
        } else if (searchCriteria.hasTitle()) {
            if (titleisExists) {
                return true;
            }
        }
        return false;
    }
}