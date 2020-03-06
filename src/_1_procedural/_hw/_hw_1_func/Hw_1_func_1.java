/**
 *        Имеются три числа - день, месяц и год, вводимые пользователем с консоли.
 *        Вывести дату следующего дня в формате "День.Месяц.Год".
 *        Учесть переход на следующий месяц, а также следующий год.
 *        Форматирование строки "День.Месяц.Год" вынести в отдельную функцию.
 */

package _1_procedural._hw._hw_1_func;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Hw_1_func_1 {
    public static void main(String[] args) {
        Scanner enteredDate = new Scanner(System.in);
        try {
            System.out.println("Введите дату: \"День.Месяц.Год\"");
            int day = enteredDate.nextInt();
            int month = enteredDate.nextInt();
            int year = enteredDate.nextInt();
            System.out.println(nextDay(day, month, year));
        } catch (InputMismatchException e) {
            System.out.println("Введены некорректные данные");
        }
    }

    static String nextDay(int day, int month, int year) {
        if (correctDay(day + 1, month, year)) {
            return (day + 1) + "." + month + "." + year;
        }
        if (month < 12) {
            return "1." + (month + 1) + "." + year;
        }
        return "1.1." + (year + 1);
    }

    static boolean correctDay(int day, int month, int year) {
        switch (month) {
            case 4:
            case 6:
            case 9:
                return day < 31;
            case 2:
                return leapYear(year) ? day < 30 : day < 29;
            default:
                return day < 32;
        }
    }

    static boolean leapYear(int year) {
        return ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0));
    }

}
