package _2_oop._ex._ex_4_polymorphism;

import _2_oop._ex._ex_3_inheritance.Enemy;

public class Alien extends Enemy {

    public Alien() {
        super(100);
    }

    @Override
    public String toString() {
        return "Alien: " + super.toString();
    }
}
