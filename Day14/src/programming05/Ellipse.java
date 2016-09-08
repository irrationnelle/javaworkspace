package programming05;

public class Ellipse extends TwoDimShape {
	private int shortRadius;
	private int longRadius;
	
	public Ellipse() {
		super();
		System.out.println(getEllipse());
	}
	
	public Ellipse(int shortRadius, int longRadius) {
		super();
		this.shortRadius = shortRadius;
		this.longRadius = longRadius;
		System.out.println(getEllipse());
	}
	
	public String getEllipse() {
		return "Ÿ��";
	}
	
	@Override
	public double getArea() {
		return shortRadius*longRadius*Math.PI;
	}
}
