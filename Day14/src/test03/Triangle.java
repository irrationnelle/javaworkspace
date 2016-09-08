package test03;

public class Triangle extends Shape {
	private int width, height;
	
	public Triangle(int x, int y, int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}
	
	public Triangle(int width, int height) {
		super(); // x=y=0;
		this.width = width;
		this.height = height;
	}
	
	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

}
