package lambda;

import java.util.List;

public class TreeNursery {

    private List<Sapling> saplings;

    public TreeNursery(List<Sapling> saplings) {
        this.saplings = saplings;
    }

    void prune(int maxHeight) {
        saplings.forEach(s->s.cut(maxHeight));
    }

    void sell(String species, int minHeight) {
        saplings.removeIf(s -> s.getSpecies().equals(species) && s.getHeight() >= minHeight);
    }

    public List<Sapling> getSaplings() {
        return saplings;
    }
}
