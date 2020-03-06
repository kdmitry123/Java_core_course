package _2_oop._ex._ex_3_inheritance;

public class Warrior extends Hero {

    public Warrior(String name) {
        super(name);
    }

    @Override
    public int getDamage() {
        return 30;
    }

    @Override
    public String getName() {
        return "Warrior " + super.getName();
    }
}
