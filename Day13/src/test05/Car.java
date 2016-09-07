package test05;

public class Car {
	private int speed;
	private String color;
	private String model;
	
	public Car(int speed, String color, String model) {
		this.setSpeed(speed);
		this.setColor(color);
		this.setModel(model);
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "¼Óµµ: "+this.speed;
	}
}
