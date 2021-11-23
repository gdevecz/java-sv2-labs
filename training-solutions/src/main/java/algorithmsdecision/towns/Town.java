package algorithmsdecision.towns;

import java.util.List;

public class Town {

    public boolean containsFewerHabitants(List<Integer> townPopulations, int upperLimit) {
        if (townPopulations == null) {
            throw new IllegalArgumentException("The townPopulations is null!");
        }
        for (int population : townPopulations) {
            if (population < upperLimit) {
                return true;
            }
        }
        return false;
    }
}
