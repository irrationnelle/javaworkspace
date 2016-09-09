package programming01;

public class Test {
	public static void main(String[] args) {
		Drawable d1 = new Circle(3);
		Drawable d2 = new Rectangle(2, 3);
		Drawable d3 = new Triangle(2, 3);
		
		d1.draw();
		d2.draw();
		d3.draw();
	}
}
