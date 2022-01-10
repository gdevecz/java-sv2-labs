package abstractclass.gamecharacter;

import java.util.Random;

public class AxeWarrior extends Character{

    public AxeWarrior(Point position, Random rnd) {
        super(position, rnd);
    }

    private int getActualSecondaryDamage(){
        return getRandom().nextInt(20) + 1;
    }

    @Override
    public void secondaryAttack(Character enemy) {
        if(enemy.getPosition().getDistance(getPosition())<2.0) {
            hit(enemy, getActualSecondaryDamage());
        }
    }
}
