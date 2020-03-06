/**
 *        Написать программу, вычисляющую и отображающую все числа Фибоначчи
 *        меньше введённого пользователем целого числа.
 *
 *        - омощью рекурсии
 */

package _1_procedural._hw._hw_1_iter;

import java.util.Scanner;

public class Hw_1_iter_2_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Введите любое целое число: ");
        int inputNumber = s.nextInt();
        int n = 1;
        int fib = recursionFibonachi(n);
        while (fib < inputNumber) {
            System.out.print(fib + " ");
            fib = recursionFibonachi(++n);
        }
    }

    static int recursionFibonachi(int n) {
        return n < 3 ? 1 : recursionFibonachi(n - 1) + recursionFibonachi(n - 2);
    }
}
