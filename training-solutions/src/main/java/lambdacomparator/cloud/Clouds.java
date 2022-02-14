package lambdacomparator.cloud;

import java.util.*;

public class Clouds {

    public CloudStorage alphabeticallyFirst(List<CloudStorage> cloudStorages) {
        return Collections.min(cloudStorages, Comparator.comparing(CloudStorage::getProvider, String::compareToIgnoreCase));
    }

    public CloudStorage bestPriceForShortestPeriod(List<CloudStorage> cloudStorages) {
        return Collections.min(cloudStorages,
                Comparator.comparing(CloudStorage::getPeriod,
                                Comparator.nullsFirst(Comparator.comparingInt(PayPeriod::getLength)))
                        .thenComparing(CloudStorage::getPrice));
    }

    public List<CloudStorage> worstOffers(List<CloudStorage> cloudStorages) {
        List<CloudStorage> result = new ArrayList<>(cloudStorages);
        result.sort(Comparator.reverseOrder());
        return result.subList(0, Math.min(result.size(), 3));
    }
}
