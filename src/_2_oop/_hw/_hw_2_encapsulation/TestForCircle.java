package _2_oop._hw._hw_2_encapsulation;

import _2_oop._hw._hw_1_class.Point;

public class TestForCircle {
    public static void main(String[] args) {
        Point circleCenter = new Point(1,1);
        Circle oneCircle = new Circle(circleCenter, 4);
        System.out.printf("Длина окружности равна: %.2f \n", oneCircle.circleLength());
        System.out.printf("Площадь круга равна: %.2f \n", oneCircle.area());
    }
}
