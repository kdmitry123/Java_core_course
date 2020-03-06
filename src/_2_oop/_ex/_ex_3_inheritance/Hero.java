package _2_oop._ex._ex_3_inheritance;

import _2_oop._ex._ex_4_polymorphism.Mortalable;

public abstract class Hero {

    private final String name;

    public Hero(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract int getDamage();

    public final void attackEnemy(final Enemy enemy){
        System.out.println(getName() + " атакует врага!");
        enemy.takeDamage(getDamage());
        System.out.println("У врага осталось " + enemy.getHealth() + " очков здоровья!");
    }
}
