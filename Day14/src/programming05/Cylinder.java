package programming05;

public class Cylinder extends ThreeDimShape{
	private int radius;
	private int height;
	
	public Cylinder() {
		super();
	}
	
	public Cylinder(int radius, int height) {
		super();
		this.radius = radius;
		this.height = height;
	}
	
	@Override
	public String toString() {
		return "¿ø±âµÕ";
	}
	
	@Override
	public double getVolume() {
		return radius*radius*Math.PI*height;
	}
	
}
