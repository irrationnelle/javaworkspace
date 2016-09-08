package programming05;

public class Ellipse extends TwoDimShape {
	private int shortRadius;
	private int longRadius;
	
	public Ellipse() {
		super();
	}
	
	public Ellipse(int shortRadius, int longRadius) {
		super();
		this.shortRadius = shortRadius;
		this.longRadius = longRadius;
	}
	
	@Override
	public String toString() {
		return "Å¸¿ø";
	}
	
	@Override
	public double getArea() {
		return shortRadius*longRadius*Math.PI;
	}
}
