package lambdacollectors.honey;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BeeKeeper {

    private List<Honey> honeys;

    public BeeKeeper(List<Honey> honeys) {
        this.honeys = honeys;
    }

    public void addHoney(Honey honey) {
        honeys.add(honey);
    }

    public int getTotalValueOfGivenGlasses(GlassSize size) {
        return honeys.stream()
                .filter(honey -> honey.getGless() == size)
                .collect(Collectors.summingInt(honeys -> (int) (honeys.getType().getPricePerKg() * honeys.getGless().getKg())));
    }

    public Map<GlassSize, Long> getAmountsOfGivenType(HoneyType type) {
        return honeys.stream()
                .filter(honey -> honey.getType() == type)
                .collect(Collectors.groupingBy(Honey::getGless, Collectors.counting()));
    }

    public Map<Boolean, List<Honey>> getGroupsByGivenTypeAndSize(HoneyType type, GlassSize size) {
        return honeys.stream()
                .collect(Collectors.partitioningBy(h -> h.getType() == type && h.getGless() == size));
    }
}
