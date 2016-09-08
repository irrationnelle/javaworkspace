package programming05;

public class Sphere extends ThreeDimShape {
	private int radius;
	
	
	public Sphere() {
		super();
	}
	
	public Sphere(int radius) {
		super();
		this.radius = radius;
	}
	
	@Override
	public String toString() {
		return "±¸";
	}
	
	@Override
	public double getVolume() {
		return (radius*radius*radius*4*Math.PI)/(double)3;
	}
}
