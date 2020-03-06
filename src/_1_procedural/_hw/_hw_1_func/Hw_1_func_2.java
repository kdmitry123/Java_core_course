/**
 *        Имеются два дома размерами a на b и c на d. Размеры вводятся польователем с консоли.
 *        Проверить, помещаются ли эти дома на участке размерами e на f.
 *        Стороны домов - параллельны сторонам участка, в остальном размещение может быть любым.
 */

package _1_procedural._hw._hw_1_func;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Hw_1_func_2 {
    public static void main(String[] args) {
        double weidthFirstHouse;
        double lengthFirstHouse;
        double weidthSecondHouse;
        double lengthSecondHouse;
        double widthFreePlot;
        double lengthFreePlot;

        Scanner houseSize = new Scanner(System.in);

        try {
            System.out.println("Введите размеры первого дома: ");
            weidthFirstHouse = houseSize.nextDouble();
            lengthFirstHouse = houseSize.nextDouble();
            System.out.println("Введите размеры второго дома: ");
            weidthSecondHouse = houseSize.nextDouble();
            lengthSecondHouse = houseSize.nextDouble();
            System.out.println("Введите размеры свободного участка: ");
            widthFreePlot = houseSize.nextDouble();
            lengthFreePlot = houseSize.nextDouble();

            if (buildingsSize(weidthFirstHouse, lengthFirstHouse, weidthSecondHouse, lengthSecondHouse, widthFreePlot, lengthFreePlot)) {
                System.out.println("Дома помещаются на участке.");
            } else {
                System.out.println("Дома не помещаются на участке");
            }
        } catch (InputMismatchException e) {
            System.out.println("Введены некорректные данные!!!");
        }
    }

    static boolean buildingsSize(double weidthFirstHouse, double lengthFirstHouse, double weidthSecondHouse, double lengthSecondHouse, double widthFreePlot, double lengthFreePlot) {
        return plotNotFilled(weidthFirstHouse + weidthSecondHouse, lengthFirstHouse + lengthSecondHouse, widthFreePlot, lengthFreePlot) ||
                plotNotFilled(weidthFirstHouse + lengthSecondHouse, lengthFirstHouse + weidthSecondHouse, widthFreePlot, lengthFreePlot);

    }

    static boolean plotNotFilled(double lengtHouses, double widthHouses, double widthFreePlot, double lengthFreePlot) {
        return ((lengtHouses <= widthFreePlot && widthHouses <= lengthFreePlot) ||
                (lengtHouses <= lengthFreePlot && widthHouses <= widthFreePlot));
    }
}
