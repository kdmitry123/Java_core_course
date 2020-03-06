package _2_oop._hw._hw_3_inheritance_polymorphism;

public class Triangle extends Shape implements CanCalculatePerimeter {
    public Point a;
    public Point b;
    public Point c;

    public Triangle(Point a, Point b, Point c) {
        super();
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public boolean isTriangle() {
        return true;
    }

    @Override
    public String toString() {
        return "Triangle {" +
                "a = " + a +
                ", b = " + b +
                ", c = " + c +
                '}';
    }

    @Override
    public double getPerimetr() {
        return a.distance(b) + b.distance(c) + c.distance(a);
    }

    @Override
    public double getArea() {
        double semiPerimeter = getPerimetr() / 2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - a.distance(b)) * (semiPerimeter - b.distance(c)) * (semiPerimeter - c.distance(a)));
    }
}
