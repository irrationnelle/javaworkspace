package programming05;

public class Triangle extends TwoDimShape {
	public Triangle() {
		super();
	}
	
	public Triangle(int width, int height) {
		super(width, height);
	}
	
	@Override
	public String toString() {
		return "»ï°¢Çü";
	}
	
	@Override
	public double getArea() {
		return super.getArea()/(double)2;
	}
}
