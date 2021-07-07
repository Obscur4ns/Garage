package garage;

import vehicles.Car;
import vehicles.Motorbike;
import vehicles.Truck;

public class App {

	public static void main(String[] args) {
		Garage garage = new Garage();

		Car car = new Car("Chevy Nova SS", 2, 4, "Black", 52, true, 50, 2);
		garage.addVehicle(car);
		Car car2 = new Car("Mazda RX7", 2, 4, "Metallic Grey", 28, false, 50, 6);
		garage.addVehicle(car2);

		Motorbike bike = new Motorbike("Harley Davidson Panhead", 0, 2, "Racing Orange", 62, false, 40, 12);
		garage.addVehicle(bike);
		Motorbike bike2 = new Motorbike("Indian Scout Bobber Twenty", 0, 2, "Thunder Black Smoke", 0, true, 40, 1);
		garage.addVehicle(bike2);

		Truck truck = new Truck("Ford Lightning", 2, 4, "Red", 20, true, 65, 3);
		garage.addVehicle(truck);

	}

}
