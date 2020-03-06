package _2_oop._ex._ex_1_class;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество секунд: ");
        Time now = new Time(in.nextInt());
        System.out.println(now);
        for (int i = 0; i < now.toString().length(); i++) {
            System.out.print("-");
        }
        System.out.println();
        Time now2 = new Time(3, 5, 7);
        System.out.println(now2);

    }
}
