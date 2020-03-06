package _2_oop._hw._hw_1_class;

import java.util.Scanner;

public class TestForCar {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Введите расход топлива для автомобиля: ");
    Car newCar = new Car(in.nextDouble());
        for(;;) {
            System.out.print("Введите 'w' - для заправки; 's' - для движения; 'z' - отобразить пройденый путь; 'q' - выход. Выберите действия: ");
            switch (in.next().charAt(0)) {
                case 'w':
                    System.out.print("Сколько топлива залить в бак: ");
                    newCar.fillFuel(in.nextDouble());
                    System.out.println("Машина заправлена, в баке " + newCar.getTankCapacity() + " литров топлива. Можете отправляться в путь.");
                    break;
                case 's':
                    System.out.print("Введите расстояние, которое проехал автомобиль: ");
                    System.out.println(newCar.move(in.nextDouble()));
                    break;
                case 'z':
                    System.out.println("Пройденный путь: " + newCar.getDistance() + " км");
                    break;
                case 'q':
                    return;
                default:
                    System.out.println("Введены некорректные данные. Попробуйте еще раз.");
                    continue;
            }
        }
    }
}

