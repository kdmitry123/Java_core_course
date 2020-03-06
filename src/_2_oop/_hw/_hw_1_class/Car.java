/**
 *     Реализуйте класс Car, моделирующий передвижение автомобиля на бензиновом топливе по оси х.
 *     Предоставьте методы для передвижения автомобиля на заданное количество километров, заполнения
 *     топливного бака заданным количеством литров бензина, вычисления расстояния, пройденного от начала
 *     координат, а также уровня топлива в баке. Укажите расход топлива (в л/км) в качестве параметра конструктора
 *     данного класса.
 */

package _2_oop._hw._hw_1_class;

public class Car {
    private double fuelConsumption;
    private double tankCapacity;
    private double distance;

    public Car(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public void setTankCapacity(double tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public void fillFuel(double liters) {
        setTankCapacity(getTankCapacity() + liters);
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }

    public String move(double dist) {
        double consFuel = dist * getFuelConsumption() / 100;
        if (consFuel > getTankCapacity()) {
            setDistance(getDistance() + 100 * getTankCapacity() / getFuelConsumption());
            setTankCapacity(0);
            return "Закончилось топливо. Машина не может продолжать движение";
        }
        this.tankCapacity -= consFuel;
        this.distance += dist;
        return "Пройденый путь: " + getDistance() + " км, остаток топлива в баке: " + getTankCapacity();

    }
}
