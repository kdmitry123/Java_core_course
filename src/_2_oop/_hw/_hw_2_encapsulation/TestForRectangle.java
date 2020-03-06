package _2_oop._hw._hw_2_encapsulation;

import _2_oop._hw._hw_1_class.Point;

public class TestForRectangle {
    public static void main(String[] args) {
        Point a = new Point(1,1);
        Point b = new Point(1,4);
        Point c = new Point(5,4);
        Point d = new Point(5,1);
        Rectangle rec = new Rectangle(a, b, c, d);
        System.out.printf("Длина диагонали равна: %.2f\n", rec.diagonalLength());
        System.out.printf("Площадь прямоугольника равна: %.2f\n", rec.area());
    }
}
