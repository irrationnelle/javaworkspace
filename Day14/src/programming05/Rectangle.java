package programming05;

public class Rectangle extends TwoDimShape {
	public Rectangle() {
		super();
		System.out.println(getRectangle());
	}
	
	public Rectangle(int width, int height) {
		super(width, height);
		System.out.println(getRectangle());
	}
	
	public String getRectangle() {
		return "직사각형";
	}
}
