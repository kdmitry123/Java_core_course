/**
 *  Проверить, является ли введённая строка палиндромом, т.е. читается одинаково в обоих направлениях
 */

package _1_procedural._hw._hw_1_string;

import java.util.Scanner;

public class Hw_1_string_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите слово для проверки: ");
        String inputString = in.next();
        System.out.println("Введенное слово " + (isPolindrome(inputString)?"является" : "не является") + " полиндромом");
    }

    static boolean isPolindrome (String a) {
        String invertedString = "";
        for(int size = a.length(), i = size - 1; i >= 0; i--){
            invertedString += a.charAt(i);
        }
        return a.equalsIgnoreCase(invertedString);
    }
}
