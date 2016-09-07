package test03;

public class Car {
	protected int speed;
	protected String color;
	protected String model;
	
	public Car() {
		System.out.println("Car 클래스 생성자 호출");
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
		System.out.println("속도: "+speed);
		System.out.println("색상: "+color);
		System.out.println("모델: "+model);
	}
}
