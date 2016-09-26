package test09;

import test10.SpeedTooFastException;
import test10.SpeedTooNegativeException;

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
	
	public void speedUp() throws Exception {	// throws �����ڴٰ� �޼ҵ带 ���
		setSpeed(getSpeed() + 10);
		if(getSpeed() > 300) {
			throw new SpeedTooFastException();	//throw(s����) ������ ������ ����
		}
	}
	
	public void speedDown() throws Exception {
		setSpeed(getSpeed() - 10);
		if(getSpeed() < 0) {
			throw new SpeedTooNegativeException();
		}
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
}
