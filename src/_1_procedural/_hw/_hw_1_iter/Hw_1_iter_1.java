/**
 *    Написать программу, вычисляющую сумму цифр введённого пользователем целого числа
 */

package _1_procedural._hw._hw_1_iter;

import java.util.Scanner;

public class Hw_1_iter_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int inputNumber = in.nextInt();
        summOfNumber(inputNumber);
    }

    static void summOfNumber(int x){
        int summ = 0;
        while (x > 0) {
            int d = x / 10;
            int k = x - d * 10;
            x = d;
            summ += k;
        }
        System.out.println("Сумма цифр введенного числа равна: " + summ);
    }
}
