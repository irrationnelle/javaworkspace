package test03;

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
	
	public int getRadius() {
		return radius;
	}
	
	@Override
	public double getArea() {
		return radius*radius*Math.PI;
	}
}
