package abstractclass.gamecharacter;

import java.util.Random;

public class Archer extends Character {

    private static final int MAX_ARROW = 100;

    private int numberOfArrow;

    public Archer(Point position, Random rnd) {
        super(position, rnd);
        numberOfArrow = MAX_ARROW;
    }

    public int getNumberOfArrow() {
        return numberOfArrow;
    }

    private int getActualSecondaryDamage() {
        return getRandom().nextInt(5) + 1;
    }

    private void shootingArrow(Character enemy) {
        numberOfArrow--;
        hit(enemy, getActualSecondaryDamage());
    }

    @Override
    public void secondaryAttack(Character enemy) {
        shootingArrow(enemy);
    }
}
