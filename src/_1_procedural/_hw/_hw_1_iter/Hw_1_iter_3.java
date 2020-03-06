/**
 *  Написать программу, отображающую статистику по осадкам за N дней. N вводится пользователем.
 *  Пользователь также должен ввести N целых чисел, обозначающих величину осадков в день.
 *  Программа должна выводить:
 *     a. Количество дней
 *     b. Сумму осадков за этот период
 *     c. Среднее количество осадков за этот период
 *     d. Максимальное количество дневных осадков за этот период
 *  Не использовать массивы!
 */

package _1_procedural._hw._hw_1_iter;

import java.util.Scanner;

public class Hw_1_iter_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество дней: ");
        int numberOfDays = in.nextInt();
        float amountOfRains = 0;
        float maxAmountOfRains = 0;
        for (int i = 1; i <= numberOfDays; ++i) {
            System.out.print("Введите количество осадков в " + i + " день = ");
            int rainyDay = in.nextInt();
            if (rainyDay > maxAmountOfRains) {
                maxAmountOfRains = rainyDay;
            }
            amountOfRains += rainyDay;
        }
        System.out.println("Количество дней = " + numberOfDays);
        System.out.println("Сумма осадков за этот период = " + amountOfRains);
        System.out.println("Среднее количество осадков за этот период = " + amountOfRains / numberOfDays);
        System.out.println("Максимальное количество дневных осадков за этот период = " + maxAmountOfRains);
    }
}
