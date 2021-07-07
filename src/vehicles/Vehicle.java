package vehicles;

public class Vehicle {

	private String make_model;
	private int noOfDoors;
	private int noOfWheels;
	private String colour;
	private int age;
	private boolean runs;
	public int baseBill;
	public int hoursOfWork;

	public Vehicle(String make_model, int noOfDoors, int noOfWheels, String colour, int age, boolean runs, int baseBill,
			int hoursOfWork) {
		super();
		this.make_model = make_model;
		this.noOfDoors = noOfDoors;
		this.noOfWheels = noOfWheels;
		this.colour = colour;
		this.age = age;
		this.runs = runs;
		this.baseBill = baseBill;
		this.hoursOfWork = hoursOfWork;
	}

	public String getMakeModel() {
		return make_model;
	}

	public void setMakeModel(String make_model) {
		this.make_model = make_model;
	}

	public int getNoOfDoors() {
		return noOfDoors;
	}

	public void setNoOfDoors(int noOfDoors) {
		this.noOfDoors = noOfDoors;
	}

	public int getNoOfWheels() {
		return noOfWheels;
	}

	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean getRuns() {
		return runs;
	}

	public void setRuns(boolean runs) {
		this.runs = runs;
	}

	public int getBaseBill() {
		return baseBill;
	}

	public void setBaseBill(int baseBill) {
		this.baseBill = baseBill;
	}

	public int getHoursOfWork() {
		return hoursOfWork;
	}

	public void setHoursOfWork(int hoursOfWork) {
		this.hoursOfWork = hoursOfWork;
	}
}
