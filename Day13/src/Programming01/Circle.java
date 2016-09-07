package Programming01;

public class Circle {
	private double radius;
	private String color;
	
	public Circle() { }
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	public double getArea() {
		return Math.PI*this.radius*this.radius;
	}
	
}
