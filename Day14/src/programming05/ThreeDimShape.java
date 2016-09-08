package programming05;

public class ThreeDimShape extends Shape {
	private int width;
	private int height;
	private int length;
	
	public ThreeDimShape() {
		super();
	}
	
	public ThreeDimShape(int width, int height, int length) {
		super();
		this.width = width;
		this.height = height;
		this.length = length;
	}
	
	public double getVolume() {
		return (double)(width*height*length);
	}
}
