package absraction;

abstract public class Car {
	
	int noWheels;
	int noOfDoors;
	int cc;
	String color;
	String brand;
	
	Car(int noWheels, int noOfDoors, int cc, String color, String brand){
		this.noWheels = noWheels;
		this.noOfDoors = noOfDoors;
		this.cc = cc;
		this.color = color;
		this.brand = brand;
	}
	
	abstract void gearSystem();

}
