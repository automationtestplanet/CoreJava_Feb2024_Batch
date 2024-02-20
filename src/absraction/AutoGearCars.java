package absraction;

public class AutoGearCars extends Car{
	
	AutoGearCars(int noWheels, int noOfDoors, int cc, String color, String brand){
		super(noWheels, noOfDoors, cc, color, brand);
	}

	@Override
	void gearSystem() {
		System.out.println("Automatic Gear System");
	}
	
	public static void main(String[] args) {
		Car car = new AutoGearCars(4,2,5000,"Red", "Audi");
		car.gearSystem();
	}

}
