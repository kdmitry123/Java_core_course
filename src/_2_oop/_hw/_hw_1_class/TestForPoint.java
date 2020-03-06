/**
 *   Проверка:
 *   Point р = new Point(3, 4).translate(1, 3).scale(2);
 *   в переменной р должна быть установлена точка с координатами Point(8, 14).
 *
 *   new Point(3, 4).translate(1, 3) == new Point(4, 7).
 *
 *   new Point(4, 7).scale(2) == Point(8, 14).
 */

package _2_oop._hw._hw_1_class;

public class TestForPoint {
    public static void main(String[] args) {
        Point p1 = new Point(3, 4).translate(1, 3).scale(2);
        System.out.println(p1.toString());
        Point p2 = new Point(3, 4).translate(1, 3);
        System.out.println(p2.getX() + ", " + p2.getY());
        Point p3 = new Point(4, 7).scale(2);
        System.out.println(p3.toString());
    }
}
