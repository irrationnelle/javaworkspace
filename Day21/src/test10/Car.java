package test10;

public class Car {
	private int speed;
	private String color;
	private String model;
	
	public Car() { }
	public Car(int speed, String color, String model) {
		this.setSpeed(speed);
		this.color = color;
		this.model = model;
	}
	
	public void speedUp() throws Exception {	// throws 던지겠다고 메소드를 명시
		setSpeed(getSpeed() + 10);
		if(getSpeed() > 300) {
			throw new Exception("OverSpeed");	//throw(s없음) 실제로 던지는 문장
		}
	}
	
	public void speedDown() throws Exception {
		setSpeed(getSpeed() - 10);
		if(getSpeed() < 0) {
			throw new Exception("NegativeSpeed");
		}
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
}
