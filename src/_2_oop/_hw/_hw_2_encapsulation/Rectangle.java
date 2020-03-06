/**
 *    Продолжение задачи 1. Используя класс точки, создать класс Rectangle, описывающий прямоугольник, и класс
 *    Circle описывающий круг. В них должны храниться поля типа Point в роли координат.
 *    Создать следующие методы в классе Rectangle:
 *    - Высчитывающий длину диагонали
 *    Методы в классе Circle:
 *    - Высчитывающий длину окружности. У обоих классов должен быть метод нахождения площади. Написать
 *    программу, тестовый класс с методом main, демонстрирующим создание объекта класса Rectangle и
 *    применение вышеперечисленных методов.
 */

package _2_oop._hw._hw_2_encapsulation;

import _2_oop._hw._hw_1_class.Point;

public class Rectangle implements Areable {
    private Point a;
    private Point b;
    private Point c;
    private Point d;

    public Rectangle(Point a, Point b, Point c, Point d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public double diagonalLength(){
        return Math.sqrt(Math.pow((a.distance(b)),2) + Math.pow((b.distance(c)),2));
    }

    @Override
    public double area () {
        return a.distance(b) * b.distance(c);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", d=" + d +
                '}';
    }
}
