package test01;

public class Car {
	private int speed;
	private String color;
	private String model;
	
	public Car() {
		speed = 0;
		color = "WHITE";
		model = "Citroen";
	}
	
	public Car(int s, String c, String m) {
		speed = s;
		color = c;
		model = m;
	}
	
	public void speedUp() {
		speed += 10;
	}
	
	public void speedDown() {
		speed -= 10;
	}
	
	public String toString() {
		return "모델: "+model+", 색상: "+color+", 현재속도: "+speed;
	}
}
