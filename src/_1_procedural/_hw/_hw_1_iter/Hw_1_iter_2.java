/**
 *        Написать программу, вычисляющую и отображающую все числа Фибоначчи
 *        меньше введённого пользователем целого числа.
 *
 *        - с помощью цикла
 */

package _1_procedural._hw._hw_1_iter;

import java.util.Scanner;

public class Hw_1_iter_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Введите любое целое число: ");
        int n = s.nextInt();
        int a = 1;
        int b = 1;
        int fib = 2;
        int i = 2;
        System.out.print(a + " " + b);
        while (true) {
            fib = a + b;
            a = b;
            b = fib;
            i++;
            if(fib > n) {
                break;
            }
            System.out.print(" "+ fib);
        }
    }
}
