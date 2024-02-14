package absraction;

public class ManualGearCars extends Car{

	ManualGearCars(int noWheels, int noOfDoors, int cc, String color, String brand){
		super(noWheels, noOfDoors, cc, color, brand);
	}
	
	@Override
	void gearSystem() {
		System.out.println("Manual Gear System");		
	}
	
	public static void main(String[] args) {
		Car car = new ManualGearCars(4,4,1200,"White", "Maruthi");
		car.gearSystem();
	}

}
