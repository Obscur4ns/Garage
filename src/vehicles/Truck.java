package vehicles;//model, noOfDoors, noOfWheels, colour, age, runs, baseBill

public class Truck extends Vehicle {

	public Truck(String make_model, int noOfDoors, int noOfWheels, String colour, int age, boolean runs, int baseBill,
			int hoursOfWork) {
		super(make_model, noOfDoors, noOfWheels, colour, age, runs, baseBill, hoursOfWork);
	}

	@Override
	public int getBaseBill() {
		return baseBill;
	}

	@Override
	public int getHoursOfWork() {
		return hoursOfWork;
	}
}
