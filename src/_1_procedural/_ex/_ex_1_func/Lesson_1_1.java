package _1_procedural._ex._ex_1_func;

import java.util.Scanner;

//  5. Написать функцию, которая принимает 2 целочисленных параметра, и возвращает наибольший из них.

public class Lesson_1_1 {
    public static void main(String[] args) {
        System.out.println("Введите два числа:");
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secodNumber = scanner.nextInt();

        System.out.println("Наибольшее число из введенных:" + max(firstNumber, secodNumber));

    }

    static int max (int x, int y){
        if(x>y) {
            return x;
        } else {
            return y;
        }
    }
}
