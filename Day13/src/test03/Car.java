package test03;

public class Car {
	protected int speed;
	protected String color;
	protected String model;
	
	public Car() {
		System.out.println("Car Ŭ���� ������ ȣ��");
		this.speed = 0;
		this.color = "White";
		this.model = "Citroen";
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
