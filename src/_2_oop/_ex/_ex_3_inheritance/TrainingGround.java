package _2_oop._ex._ex_3_inheritance;

public class TrainingGround {
    public static void main(String[] args) {
        Enemy newEnemy = new Enemy(100);

        Hero hero2 = new Archer("Mike");
        hero2.attackEnemy(newEnemy);

        Hero hero3 = new Warrior("Dan");
        hero3.attackEnemy(newEnemy);

        Hero hero4 = new Wizard("Alex");
        hero4.attackEnemy(newEnemy);
    }
}
