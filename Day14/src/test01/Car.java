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
		System.out.println("�ӵ�: "+speed);
		System.out.println("��: "+model);
		System.out.println("����: "+color);
	}
}
