package _2_oop._ex._ex_3_inheritance;

public class Archer extends Hero {

    public Archer(String name) {
        super(name);
    }

    @Override
    public int getDamage() {
        return 40;
    }

    @Override
    public String getName() {
        return "Archer " + super.getName();
    }
}
