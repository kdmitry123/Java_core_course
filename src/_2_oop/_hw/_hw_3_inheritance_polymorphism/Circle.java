package _2_oop._hw._hw_3_inheritance_polymorphism;

public class Circle extends Shape implements CanCalculatePerimeter {
    private Point centerPoint;
    private int radius;

    public Circle(Point centerPoint, int radius) {
        super();
        this.centerPoint = centerPoint;
        this.radius = radius;
    }

    public double getPerimetr() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle {" +
                "centerPoint=" + centerPoint +
                ", radius=" + radius +
                '}';
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    public int getRadius() {
        return radius;
    }
}
