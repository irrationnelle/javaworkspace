package test01;

public class Car {
	// Field Area
	String model;
	int speed;
	int mileage;
	boolean echo;
	
	// Method Area
	void printCarStatus() {
		System.out.println("---Current Car Status---");
		System.out.println("Model: "+model);
		System.out.println("Speed: "+speed);
		System.out.println("Mileage: "+mileage);
		System.out.println("Echo mode: "+echo);
	}
}
