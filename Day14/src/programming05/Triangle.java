package programming05;

public class Triangle extends TwoDimShape {
	public Triangle() {
		super();
		System.out.println(getTriangle());
	}
	
	public Triangle(int width, int height) {
		super(width, height);
		System.out.println(getTriangle());
	}
	
	public String getTriangle() {
		return "»ï°¢Çü";
	}
	
	@Override
	public double getArea() {
		return super.getArea()/(double)2;
	}
}
