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
		Car car2 = new Car("Mazda RX7", 2, 4, "Metallic Grey", 28, false, 50, 6);
		garage.addCar(car2);

		Motorbike bike = new Motorbike("Harley Davidson Panhead", 0, 2, "Racing Orange", 62, false, 40, 12);
		garage.addBike(bike);
		Motorbike bike2 = new Motorbike("Indian Scout Bobber Twenty", 0, 2, "Thunder Black Smoke", 0, true, 40, 1);
		garage.addBike(bike2);

		Truck truck = new Truck("Ford Lightning", 2, 4, "Red", 20, true, 65, 3);
		garage.addTruck(truck);

	}

	public static Car getCar() {
		return car;
	}

	public static void setCar(Car car) {
		App.car = car;
	}

	public static Motorbike getBike() {
		return bike;
	}

	public static void setBike(Motorbike bike) {
		App.bike = bike;
	}

	public static Truck getTruck() {
		return truck;
	}

	public static void setTruck(Truck truck) {
		App.truck = truck;
	}

	public void printCar() {
		System.out.println("Vehicle: " + car);
		System.out.println("Total Bill: " + Garage.totalBill);
	}

	public void printMotorbike() {
		System.out.println("Vehicle: " + bike);
		System.out.println("Total Bill: " + Garage.totalBill);
	}

	public void printTruck() {
		System.out.println("Vehicle: " + truck);
		System.out.println("Total Bill: " + Garage.totalBill);
	}

}
