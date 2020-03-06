package _4_collections._hw._hw_2;

import java.util.HashMap;
import java.util.Map;

public class Garage {
    private Map<Car, Integer> garage = new HashMap<>();


    public Integer numberOfCars(Car car) {
        return (!this.garage.containsKey(car)) ? 0 : this.garage.get(car);
    }

    public boolean getCar(Car car) {
        if (!this.garage.containsKey(car)) {
            return false;
        }
        this.garage.put(car, this.garage.get(car) - 1);
        if (this.garage.get(car) < 1) {
            this.garage.remove(car);
        }
        return true;
    }

    public void garageDescription() {
        for (Map.Entry<Car, Integer> entry : garage.entrySet()) {
            System.out.println(entry.getKey() + ", \nКоличество автомобилей данного вида: " + entry.getValue() + "\n");
        }
    }

    public void parkingCar(Car car) {
        this.garage.put(car, this.garage.containsKey(car) ? this.garage.get(car) + 1 : 1);
    }
}
