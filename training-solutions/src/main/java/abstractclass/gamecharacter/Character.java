package abstractclass.gamecharacter;

import java.util.Random;

public abstract class Character {

    private static final int MAX_DAMAGE = 10;

    private static final int MAX_DEFENCE = 5;

    private int hitPoint = 100;

    private Point position;

    private Random random;

    public Character(Point position, Random random) {
        this.position = position;
        this.random = random;
    }

    public boolean isAlive() {
        return hitPoint > 0;
    }

    protected int getActualPrimaryDamage() {
        return random.nextInt(MAX_DAMAGE) + 1;
    }

    private int getActualDefence() {
        return random.nextInt(MAX_DEFENCE + 1);
    }

    protected void hit(Character enemy, int damage) {
        if (enemy.getActualDefence() < damage) {
            enemy.decreaseHitPoint(damage);
        }
    }

    public void primaryAttack(Character enemy) {
        hit(enemy, getActualPrimaryDamage());
    }

    private void decreaseHitPoint(int diff) {
        hitPoint -= diff;
    }

    abstract public void secondaryAttack(Character enemy);

    public Point getPosition() {
        return position;
    }

    public int getHitPoint() {
        return hitPoint;
    }

    public Random getRandom() {
        return random;
    }

    public void setPosition(Point position) {
        this.position = position;
    }
}