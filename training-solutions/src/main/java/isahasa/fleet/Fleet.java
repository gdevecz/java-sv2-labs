package isahasa.fleet;

import java.util.ArrayList;
import java.util.List;

public class Fleet implements Ship {

    private List<Ship> ships = new ArrayList<>();

    private int waitingPeople;

    private int waitingCargo;

    public void addShip(Ship newShip) {
        ships.add(newShip);
    }

    public void loadShip(int passengers, int cargoWeight) {
        waitingPeople = passengers;
        waitingCargo = cargoWeight;
        for (Ship ship : ships) {
            if (waitingPeople > 0 && ship instanceof CanCarryPassengers) {
                waitingPeople = ((CanCarryPassengers) ship).loadPassenger(waitingPeople);
            }
            if (waitingCargo > 0 && ship instanceof CanCarryGoods) {
                waitingCargo = ((CanCarryGoods) ship).loadCargo(waitingCargo);
            }
        }
    }

    public int getWaitingPeople() {
        return waitingPeople;
    }

    public int getWaitingCargo() {
        return waitingCargo;
    }
}
