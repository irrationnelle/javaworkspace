package test03;

public class Car {
	private int speed;
	private String color;
	private String model;
	
	private static int numOfCars = 0;
	
	public Car() {
	
	}
	
	public Car(int speed, String color, String model) {
		this.speed = speed;
		this.color = color;
		this.model = model;
		numOfCars++;
	}

	public static int getNumOfCars() {
		return numOfCars;
	}

}
