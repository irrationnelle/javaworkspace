package programming05;

public class Rectangle extends TwoDimShape {
	public Rectangle() {
		super();
	}
	
	public Rectangle(int width, int height) {
		super(width, height);
	}
	
	@Override
	public String toString() {
		return "직사각형";
	}
}
