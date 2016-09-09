package programming01;

public class Triangle extends Shape implements Drawable{
	private int width;
	private int height;
	
	public Triangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	@Override
	public double getArea() {
		return width*height/(double)2;
	}
	
	public void draw() {
		System.out.println("»ï°¢ÇüÀÌÁö·Õ");
	};
}
