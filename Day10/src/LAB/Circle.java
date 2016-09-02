package LAB;

public class Circle {
	private double radius;
	public static final double PI = 3.141592;
	
	public Circle(double radius) {
		this.setRadius(radius);
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double square() {
		return radius*radius;
	}
	
	public double getArea() {
		return PI * square();
	}
	
	public double getPerimeter() {
		return PI*radius*2;
	}
	
	public static final double getPi() {
		return PI;
	}
//	
//	public static void main(String[] args) {
//		square(10, 0);
//		
//		System.out.println(Circle.getPi());
//	}
}
