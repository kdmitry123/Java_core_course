package _2_oop._hw._hw_3_inheritance_polymorphism;

public class Point extends Shape {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point point){
        return Math.sqrt(Math.pow((point.x - this.x),2) + Math.pow((point.y - this.y),2));
    }

    @Override
    public String toString() {
        return "Point {" +
                "x = " + x +
                ", y = " + y +
                '}';
    }

    @Override
    public double getArea() {
        return 0;
    }
}
