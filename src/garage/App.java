package garage;

import vehicles.Car;
import vehicles.Motorbike;
import vehicles.Truck;

public class App {

	private static Car car;
	private static Motorbike bike;
	private static Truck truck;

	public static void main(String[] args) {
		Garage garage = new Garage();

		Car car = new Car("Chevy Nova SS", 2, 4, "Black", 52, true, 50, 2);
		garage.addCar(car);

		Motorbike bike = new Motorbike("Harley Davidson Panhead", 0, 2, "Racing Orange", 62, false, 40, 12);
		garage.addBike(bike);

		Truck truck = new Truck("Ford Lightning", 2, 4, "Red", 20, true, 65, 3);
		garage.addTruck(truck);

	}

}
