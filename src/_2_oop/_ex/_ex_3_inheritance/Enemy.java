package _2_oop._ex._ex_3_inheritance;

import _2_oop._ex._ex_4_polymorphism.Mortalable;

public class Enemy implements Mortalable {

    private int health;

    public Enemy(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void takeDamage(int damage) {
        setHealth((getHealth() - damage)>0 ? getHealth() - damage : 0);
    }

    @Override
    public boolean isAlive() {
        return getHealth() > 0;
    }

    @Override
    public String toString() {
        return "health=" + health;
    }
}
