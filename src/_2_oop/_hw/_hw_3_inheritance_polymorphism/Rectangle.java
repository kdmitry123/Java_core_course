package _2_oop._hw._hw_3_inheritance_polymorphism;

public class Rectangle extends Shape implements CanCalculatePerimeter {
    private Point a;
    private Point b;
    private Point c;
    private Point d;

    public Rectangle(Point a, Point b, Point c, Point d) {
        super();
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    @Override
    public boolean isRectangle() {
        return true;
    }

    @Override
    public double getArea () {
        return a.distance(b) * b.distance(c);
    }

    @Override
    public double getPerimetr() {
        return (a.distance(b) + b.distance(c)) * 2;
    }

    @Override
    public String toString() {
        return "Rectangle {" +
                "a = " + a +
                ", b = " + b +
                ", c = " + c +
                ", d = " + d +
                '}';
    }

    public double getWidth(){
        return a.distance(b);
    }

    public double getHeight(){
        return b.distance(c);
    }

    public double firstDiagonalLength(){
        return a.distance(c);
    }

    public double secondDiagonalLength(){
        return b.distance(d);
    }
}
