package introexceptiontrycatchtrace;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Winner {

    private List<String> winners = new ArrayList<>();

    public String getWinner() {
        int indexOfWinner = new Random().nextInt(winners.size());
        return winners.get(indexOfWinner).toUpperCase();
    }

    public void addWinner(String name) {
        winners.add(name);
    }

    public List<String> getWinners() {
        return winners;
    }
}
