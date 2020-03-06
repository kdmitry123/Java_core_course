package _2_oop._ex._ex_4_polymorphism;

public interface Mortalable {
    boolean isAlive();

    default boolean isDead(){
        return !isAlive();
    }
}
