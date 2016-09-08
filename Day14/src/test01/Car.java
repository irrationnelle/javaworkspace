package test01;

public class Car {
	private int speed;
	private String model;
	private String color;
	
	public Car(int speed, String model, String color) {
		this.speed = speed;
		this.model = model;
		this.color = color;
	}
	
	public void speedUp() {
		speed += 10;
	}
	
	public void speedDown() {
		speed -= 10;
	}
	
	public void printCar() {
		System.out.println("속도: "+speed);
		System.out.println("모델: "+model);
		System.out.println("색상: "+color);
	}
}
