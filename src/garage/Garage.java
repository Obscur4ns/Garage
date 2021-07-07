package garage;

import java.util.ArrayList;

import vehicles.Vehicle;

public class Garage {

	public ArrayList<Vehicle> vehicles; // does not like without

	public double totalBill() {
		double totalBill = 0.0;
		ArrayList<Vehicle> vehicles = this.vehicles; // does not like without this.vehicles either, causes lines 14, 26,
														// 31 to error
		for (Vehicle v : vehicles) {
			if (v.getClass().getSimpleName().equals("Car"))
				if (v.getClass().getSimpleName().equals("Motorbike"))
					if (v.getClass().getSimpleName().equals("Truck"))
						totalBill += v.baseBill + v.hoursOfWork;

		}
		return totalBill;

	}

	public void addVehicle(Vehicle vehicles) {
		this.vehicles.add(vehicles);

	}

	public void removeVehicle(Vehicle vehicles) {
		this.vehicles.remove(vehicles);
	}

}
