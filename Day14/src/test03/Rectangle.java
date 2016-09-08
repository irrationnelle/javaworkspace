package test03;

public class Rectangle extends Shape {
	private int width, height;
	
	public Rectangle(int x, int y, int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}
	
	public Rectangle(int width, int height) {
		super();
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
