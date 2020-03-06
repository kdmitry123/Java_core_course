/**
 *  Проверить, является ли введённая строка палиндромом, т.е. читается одинаково в обоих направлениях
 */

package _1_procedural._hw._hw_1_string;

import java.util.Scanner;

public class Hw_1_string_1_2 {
    public static void main(String[] args) {
        isPolindrome();
    }

    static void isPolindrome() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите слово для проверки: ");
        String inputString = in.next();
        StringBuffer reverseString = new StringBuffer(inputString);
        System.out.println("Введенное слово " + (inputString.equalsIgnoreCase(reverseString.reverse().toString())?"является полиндромом" : "не является полиндромом"));
    }
}
