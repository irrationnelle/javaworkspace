package test04;

public class Car {
	protected int speed;
	protected String color;
	protected String model;
	
	public Car(int speed, String color, String model) {
		System.out.println("Car Ŭ���� ������ ȣ��");
		this.speed = speed;
		this.color = color;
		this.model = model;
	}
	
	public void speedUp() {
		speed += 10;
	}
	
	public void speedDown() {
		speed -= 10;
	}
	
	public void printCar() {
		System.out.println("�ӵ�: "+speed);
		System.out.println("����: "+color);
		System.out.println("��: "+model);
	}
}
