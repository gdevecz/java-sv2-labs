package collectionsiterator;

import java.util.Iterator;
import java.util.List;

public class ChristmasShopping {

    private List<ChristmasPresent> christmasPresents;

    public ChristmasShopping(List<ChristmasPresent> christmasPresents) {
        this.christmasPresents = christmasPresents;
    }

    public void addNewPresent(ChristmasPresent present) {
        christmasPresents.add(present);
    }

    public void removeTooExpensivePresent(int maxPrice) {
        Iterator<ChristmasPresent> iterator = christmasPresents.iterator();
        while (iterator.hasNext()) {
            int actualPrice = iterator.next().getPrice();
            if (actualPrice > maxPrice) {
                iterator.remove();
            }
        }
    }

    public List<ChristmasPresent> getChristmasPresents() {
        return christmasPresents;
    }
}
