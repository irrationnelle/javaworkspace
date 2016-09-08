package test02;

public class Test {
	// Not consider a polymorphism
	public static void main(String[] args) {
		Rectangle r = new Rectangle(10, 20);
		Triangle t = new Triangle(10, 20);
		Circle c = new Circle(10);
		
		System.out.println(r.getArea());
		System.out.println(t.getArea());
		System.out.println(c.getArea());
	}
}
