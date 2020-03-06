package _2_oop._ex._ex_4_polymorphism;

import _2_oop._ex._ex_3_inheritance.Enemy;

public class Zombie extends Enemy {
    private final static int INIT_HEALTH = 100;

    private boolean rised = true;

    public Zombie() {
        super(INIT_HEALTH);
    }

    public Zombie(boolean isRisable) {
        this();
        this.rised = !isRisable;
    }

    @Override
    public void takeDamage(int damage) {
        if (isAlive()) {
            super.takeDamage(damage);
            if (isDead() && isntRised()) {
                setHealth((int) (INIT_HEALTH * 0.3));
                setRised(true);
                System.out.println("Zombie воскрес!");
            }
        } else
            System.out.println("Zombie убит!");
    }

    public boolean isRised() {
        return rised;
    }

    public boolean isntRised() {
        return !rised;
    }

    public void setRised(boolean rised) {
        this.rised = rised;
    }

    @Override
    public String toString() {
        return "Zombie: " + super.toString();
    }
}
