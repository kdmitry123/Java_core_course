package _2_oop._ex._ex_3_inheritance;

public class Wizard extends Hero {

    public Wizard(String name) {
        super(name);
    }

    @Override
    public int getDamage() {
        return 20;
    }

    @Override
    public String getName() {
        return "Wizard " + super.getName();
    }
}