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
	public static int totalBill;

	public ArrayList<Vehicle> vehicles = new ArrayList<>();

	public double totalBill() {
		double bill = 0.0;
		for (Vehicle vehicles : this.vehicles)
			;
		;
		{
			bill += car + hoursOfWork;
		}
		return bill;
	}

	public static int totalBillCar() {
		totalBill = car + hoursOfWork;
		return totalBill;

	}

	public static int totalBillBike() {
		totalBill = bike + hoursOfWork;
		return totalBill;
	}

	public static int totalBillTruck() {
		totalBill = truck + hoursOfWork;
		return totalBill;
	}

	public void addCar(Car car) {

	}

	public void addBike(Motorbike bike) {

	}

	public void addTruck(Truck truck) {

	}

	public void removeTruck(Truck truck) {

	}

	public void removeBike(Motorbike bike) {

	}

	public void removeCar(Car car) {

	}
}
