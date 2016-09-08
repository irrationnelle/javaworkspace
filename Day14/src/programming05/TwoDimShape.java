package programming05;

public class TwoDimShape extends Shape {
	private int width;
	private int height;
	
	public TwoDimShape() {
		super();
	}
	
	public TwoDimShape(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	public double getArea() {
		return (double)(width*height);
	}
}
