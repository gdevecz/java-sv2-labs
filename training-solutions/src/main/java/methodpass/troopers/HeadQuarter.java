package methodpass.troopers;

import java.util.ArrayList;
import java.util.List;

public class HeadQuarter {

    private List<Trooper> troopers = new ArrayList<>();

    private TroopersValidator validator = new TroopersValidator();

    public void moveTrooperByName(String name, Position target) {
        if (!validator.isNameValid(name) || !validator.isTargetValid(target)){
            throw new IllegalArgumentException("The name or position is null or blank.");
        }
        findTrooperByName(name).changePosition(target);
    }

    public void moveTrooper(Trooper trooper, Position target) {
        if( !validator.isTrooperValid(trooper) || !validator.isPositionValid(target)){
            throw new IllegalArgumentException("The trooper or target is null.");
        }
        trooper.changePosition(target);
    }

    public List<Trooper> getTroopers() {
        return List.copyOf(troopers);
    }

    public void addTrooper(Trooper trooper) {
        if(!validator.isTrooperValid(trooper)) {
            throw new IllegalArgumentException("The trooper is null.");
        }
        troopers.add(trooper);
    }

    public void moveClosestTrooper(Position target) {
        Trooper closestTrooper = findClosestTrooper(target);
        moveTrooper(closestTrooper, target);
    }

    private Trooper findTrooperByName(String name) {
        int i = 0;
        while (i < troopers.size() && !troopers.get(i).getName().equals(name)) {
            i++;
        }
        if (i == troopers.size()) {
            throw new IllegalArgumentException("This name is not in the list.");
        }
        return troopers.get(i);
    }

    private Trooper findClosestTrooper(Position target) {
        Trooper closest = troopers.get(0);
        for (Trooper trooper : troopers) {
            if (trooper.distanceFrom(target) < closest.distanceFrom(target)) {
                closest = trooper;
            }
        }
        return closest;
    }
}
