package programming01;

public class Rectangle extends Shape implements Drawable {
	private int width;
	private int height;
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	@Override
	public double getArea() {
		return (double)(width*height);
	}
	
	public void draw() {
		System.out.println("직사각형이지롱");
	};
}
