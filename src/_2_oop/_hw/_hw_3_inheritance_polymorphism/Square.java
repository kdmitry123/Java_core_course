package _2_oop._hw._hw_3_inheritance_polymorphism;

public class Square extends Rectangle {
    private Point a;
    private Point b;
    private Point c;
    private Point d;

    public Square(Point a, Point b, Point c, Point d) {
        super(a, b, c, d);
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    @Override
    public double getPerimetr() {
        return this.a.distance(this.b) * 4;
    }

    @Override
    public double getArea() {
        return Math.pow(a.distance(b), 2);
    }

    @Override
    public double getWidth() {
        return super.getWidth();
    }

    @Override
    public double getHeight() {
        return super.getWidth();
    }

    @Override
    public String toString() {
        return "Square {" +
                "a = " + a +
                ", b = " + b +
                ", c = " + c +
                ", d = " + d +
                '}';
    }
}
