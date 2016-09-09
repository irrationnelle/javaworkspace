package programming01;

public class Circle extends Shape implements Drawable{
	private int radius;
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	@Override
	public double getArea() {
		return radius*radius*Math.PI;
	}
	
	public void draw() {
		System.out.println("ฟ๘ภฬม๖ที");
	};
}
