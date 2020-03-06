package _1_procedural._ex._ex_1_func;

import java.util.Scanner;

/**
 *      На писать функцию, которая принимает букву русского алфавита и целое число.
 *      На выходе функции должен быть символ, который смещен вправо на переданное число от переданной буквы.
 */

public class Lesson_1_3 {
    public static void main(String[] args) {
        characterOffset();
    }

    static void characterOffset() {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int num = scanner.nextInt();
        char ch = str.charAt(0);
        System.out.println(Character.toString((char)(ch+num)));
    }
}
