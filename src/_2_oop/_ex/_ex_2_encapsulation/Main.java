package _2_oop._ex._ex_2_encapsulation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Atm atm = new Atm(10, 10, 10);
        System.out.println(atm.toString());
        System.out.println("Хотите ли вы добавить в купюры в банкомат (y/n) ?");
        switch (in.nextLine().toLowerCase()) {
            case "y" :
                System.out.println("Введите количество добавляемых в банкомат купюр номиналом 10: ");
                atm.addMoney(Atm.NOTE10,in.nextInt());
                System.out.println("Введите количество добавляемых в банкомат купюр номиналом 20: ");
                atm.addMoney(Atm.NOTE20,in.nextInt());
                System.out.println("Введите количество добавляемых в банкомат купюр номиналом 50: ");
                atm.addMoney(Atm.NOTE50,in.nextInt());
                System.out.println("Произведено добавление денег в банкомат.");
                System.out.println(atm.toString());
                break;
            case "n" :
                break;
            default:
                System.out.println("Введены некорректные данные. Добавление денег в банкомат производиться не будет.");
        }
        System.out.println("Введите сумму, которую хотите снять: ");
        System.out.println(atm.getMoney(in.nextInt()));
        System.out.println(atm.toString());

    }
}
