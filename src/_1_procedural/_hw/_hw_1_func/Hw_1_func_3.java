/**
 *        Написать программу, вычисляющую корни квадратного уравнения вида ax² + bx + c = 0,
 *        где a, b и c - вводимые пользователем из консоли данные. Учитывать только реальные корни
 *        (в случае отрицательного дискриминанта выводить сообщение пользователю).
 *        При решении создать и использовать следующие вынесенные функции:
 *        - функция isPositive, определяющая, является ли число положительным
 *        - функция isZero, определяющая, является ли число нулём
 *        - функция discriminant, вычисляющая дискриминант
 */

package _1_procedural._hw._hw_1_func;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Hw_1_func_3 {
    public static void main(String[] args) {
        Scanner enterNumber = new Scanner(System.in);
        System.out.println("Введите значения переменных a, b, c: ");
        try {
            int a = enterNumber.nextInt();
            int b = enterNumber.nextInt();
            int c = enterNumber.nextInt();
            int disc = discriminant(a, b, c);
            if (isPositive(disc)) {
                if (isZero(disc)) {
                    System.out.println("Значения x1 и x2 равны: " + (-b / (2 * a)));
                } else
                    System.out.println("Значение x1 = " + (Math.sqrt(disc) - b) / (2 * a) + "  Значение x2 = " + (-Math.sqrt(disc) - b) / (2 * a));
            } else System.out.println("Дискриминант имеет отрицательное значение. Вещественных корней не существует");
        } catch (InputMismatchException e){
            System.out.println("Введены некорректные данные!!!");
        }
    }

    static int discriminant(int a, int b, int c) {
        return (int)(Math.pow(b, 2) - 4 * a * c);
    }

    static boolean isPositive(int disc) {
        if (disc >= 0) {
            return true;
        } else {
            return false;
        }

    }

    static boolean isZero(int disc) {
        if (disc == 0) {
            return true;
        } else {
            return false;
        }
    }
}
