/**
 *        Написать программу, преобразующую строку, содержащую число в римском формате,
 *        в число в арабском формате. Границы чисел: от 1 до 3999. Предусмотреть случай,
 *        когда меньший символ идёт перед большим: Например: CM == 900.
 *        Соответствие:
 *        M - 1000
 *        D - 500
 *        C - 100
 *        L - 50
 *        X - 10
 *        V - 5
 *        I - 1
 */

package _1_procedural._hw._hw_1_string;

import java.util.Scanner;

public class Hw_1_string_2 {
    static String[] rome = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    static int[] arabic = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число в римском формате: ");
        String inputNumber = in.next();
        System.out.println("Введенное число в арабском формате: " + convertNumber(inputNumber));
    }

    static int convertNumber(String input) {
        int res = 0;
        String inpNum = input;
        for (int i = 0; i < rome.length; i++) {
            String romeDigit = rome[i];
            int lengthRomeDigit = romeDigit.length();
            while ((inpNum.length() >= lengthRomeDigit) && (inpNum.substring(0, lengthRomeDigit).equals(romeDigit))) {
                res += arabic[i];
                inpNum = inpNum.substring(lengthRomeDigit);
            }
        }
        return res;
    }
}
