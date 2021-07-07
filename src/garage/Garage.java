package garage;

import java.util.ArrayList;

import vehicles.Car;
import vehicles.Motorbike;
import vehicles.Truck;
import vehicles.Vehicle;

public class Garage {

	public static int car;
	public static int bike;
	public static int truck;
	public static int hoursOfWork;
	public static double totalBill;
	public static int baseBill;

	public ArrayList<Vehicle> vehicles;

	public double totalBill() {
		double bill = 0.0;
		ArrayList<Vehicle> vehicles = this.vehicles;
		for (int i = 0; i < vehicles.size(); i++) {
			vehicles.get(i);
			;
		}
		;
		{
			bill += baseBill + hoursOfWork;
		}
		return bill;
	}

	public void addCar(Car car) {
		return;

	}

	public void addBike(Motorbike bike) {
		return;

	}

	public void addTruck(Truck truck) {
		return;

	}

	public void removeTruck(Truck truck) {

	}

	public void removeBike(Motorbike bike) {

	}

	public void removeCar(Car car) {

	}
}
