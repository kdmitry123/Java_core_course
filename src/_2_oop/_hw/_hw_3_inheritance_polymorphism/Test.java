package _2_oop._hw._hw_3_inheritance_polymorphism;

public class Test {
    public static void main(String[] args) {
        Triangle firstTriangle = new Triangle(new Point(1,1), new Point(1,3), new Point(5, 2));
        Rectangle firstRectangle = new Rectangle(new Point(1,1), new Point(1,3), new Point(5,3), new Point(5,1));
        Triangle secondTriangle = new Triangle(new Point(1,1), new Point(1,3), new Point(5, 2));
        Point firstPoint = new Point(0,0);
        Circle firstCircle = new Circle(firstPoint, 3);
        Rhombus newRhombus = new Rhombus(new Point(0,2), new Point(3,4), new Point(6,2), new Point(3,0));
        Square newSquare = new Square(new Point(0,0), new Point(0,2), new Point(2,2), new Point(2,0));

/**
 *      Проверка является ли данная фигура треугольником или прямоугольником
 */
        System.out.println(newSquare.isRectangle());
        System.out.println(firstPoint.isRectangle());
        System.out.println(secondTriangle.isRectangle());
        System.out.println(newSquare.isTriangle());
        System.out.println(firstPoint.isTriangle());
        System.out.println(secondTriangle.isTriangle());
        System.out.println();

/**
 *      Проверка является ли данная фигура треугольником или прямоугольником
 */
        System.out.println(ShapeUtils.isTriangle(firstTriangle));
        System.out.println(ShapeUtils.isTriangle(firstRectangle));
        System.out.println(ShapeUtils.isRectangle(firstTriangle));
        System.out.println(ShapeUtils.isRectangle(firstRectangle));
        System.out.println();

/**
 *      Проверка равенства площади фигур
 */

        System.out.println(firstTriangle.equalSquares(firstRectangle));
        System.out.println(firstTriangle.equalSquares(secondTriangle));
        System.out.println(firstRectangle.equalSquares(firstPoint));
        System.out.println(firstPoint.equalSquares(new Point(1,1)));
        System.out.println();

/**
 *      Проверка методов треугольника
 */
        System.out.println("Периметр треугольника: " + firstTriangle.getPerimetr());
        System.out.println("Площадь треугольника: " + firstTriangle.getArea());
        System.out.println(firstTriangle.getName());
        System.out.println(firstTriangle.toString());
        System.out.println();

/**
 *      Проверка методов прямоугольника
 */
        System.out.println("Площадь прямоугольника: " + firstRectangle.getArea());
        System.out.println("Периметр прямоугольника: " + firstRectangle.getPerimetr());
        System.out.println("Ширина/высота прямоугольника: " + firstRectangle.getWidth() + " / " + firstRectangle.getHeight());
        System.out.println("Длина диагонали прямоугольника: " + firstRectangle.firstDiagonalLength());
        System.out.println(firstRectangle.getName());
        System.out.println(firstRectangle.toString());
        System.out.println();

/**
 *      Проверка методов ромба
 */
        System.out.println("Периметр ромба: " + newRhombus.getPerimetr());
        System.out.println("Площадь ромба: " + newRhombus.getArea());
        System.out.println("Длины диагоналей: " + newRhombus.firstDiagonalLength() + " / " + newRhombus.secondDiagonalLength());
        System.out.println("Длина стороны ромба: " + newRhombus.getHeight());
        System.out.println(newRhombus.getName());
        System.out.println(newRhombus.toString());
        System.out.println();

/**
 *      Проверка методов круга
 */

        System.out.println("Площадь круга: " + firstCircle.getArea());
        System.out.println("Длина окружности"  + firstCircle.getPerimetr());
        System.out.println("Радиус окружности: " + firstCircle.getRadius());
        System.out.println(firstCircle.getName());
        System.out.println(firstCircle.toString());
        System.out.println();

/**
 *      Проверка методов квадрата
 */

        System.out.println("Площадь квадрата: " + newSquare.getArea());
        System.out.println("Периметр квадрата: " + newSquare.getPerimetr());
        System.out.println("Длина стороны квадрата: " + newSquare.getHeight());
        System.out.println("Длина диагоналей квадрата: " + newSquare.firstDiagonalLength());
        System.out.println(newSquare.getName());
        System.out.println(newSquare.toString());

    }
}
