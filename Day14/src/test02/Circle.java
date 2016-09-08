package test02;

public class Circle extends Shape {
	private int radius;
	
	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}
	public Circle(int radius) {
		super(); // x=y=0;
		this.radius = radius;
	}
	
	public double getArea() {
		return this.radius*this.radius*Math.PI;
	}
}
