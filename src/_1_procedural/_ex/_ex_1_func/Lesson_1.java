/**
 * 1. Задачка с порами года (if-else && switch).
 *    Ввод номер месяца, вывод названия.
 */

package _1_procedural._ex._ex_1_func;

import java.util.Scanner;

public class Lesson_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();

        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("осень");
                break;
            default:
                System.out.println("Введен не верный месяц");
                break;
        }
    }
}
