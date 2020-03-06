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

public class Circle implements Areable {
    private Point centerPoint;
    private int radius;

    public Circle(Point centerPoint, int radius) {
        this.centerPoint = centerPoint;
        this.radius = radius;
    }

    public double circleLength() {
        return 2 * Math.PI * this.radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "centerPoint=" + centerPoint +
                ", radius=" + radius +
                '}';
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(this.radius, 2);
    }
}
