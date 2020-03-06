package _2_oop._hw._hw_3_inheritance_polymorphism;

public class Rhombus extends Square {
    private Point a;
    private Point b;
    private Point c;
    private Point d;

    public Rhombus(Point a, Point b, Point c, Point d) {
        super(a, b, c, d);
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    @Override
    public double getArea() {
        return firstDiagonalLength() * secondDiagonalLength() / 2;
    }

    @Override
    public String toString() {
        return "Rhombus {" +
                "a = " + a +
                ", b = " + b +
                ", c = " + c +
                ", d = " + d +
                '}';
    }
}
