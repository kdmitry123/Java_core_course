package _2_oop._ex._ex_4_polymorphism;

import _2_oop._ex._ex_3_inheritance.*;
import java.util.Random;


public class BattleGround {
    public static final int COUNT_ENEMIES = 10;

    public static void main(String[] args) {
        Hero neo = new Warrior("Neo");

        Random rnd = new Random();
        Enemy[] enemies = new Enemy[COUNT_ENEMIES];

        for (int i = 0; i < COUNT_ENEMIES; i++) {
            enemies[i] = new Zombie(rnd.nextBoolean());
        }

        int i = 0;
        while (i < COUNT_ENEMIES) {
            if (enemies[i].isAlive()) {
                neo.attackEnemy(enemies[i]);
            } else i++;

        }
    }
}
