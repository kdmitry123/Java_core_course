package _4_collections._hw._hw_2;

public class TestGarage {
    public static void main(String[] args) {
        Garage garage = new Garage();
        Bus wv = new Bus("WV", "AS", 2009, "L", 3600);
        Truck zil = new Truck("Zil", "123", 1999, "M", 4100);
        PassengerCar volvo = new PassengerCar("Volvo", "s80", 2019, "L", 1800);
        PassengerCar citroen = new PassengerCar("Citroen", "Picasso", 2015, "L", 1500);
        garage.parkingCar(wv);
        garage.parkingCar(zil);
        garage.parkingCar(volvo);
        garage.parkingCar(citroen);

        System.out.println("Автомобили в гараже:");
        garage.garageDescription();

        System.out.println("Количество автомобилей Citroen в гараже: " + garage.numberOfCars(citroen) + "\n");

        System.out.println("Автомобиль Zil выехал из гаража.");
        garage.getCar(zil);
        System.out.println();

        System.out.println("Автомобили в гараже:");
        garage.garageDescription();



    }
}
