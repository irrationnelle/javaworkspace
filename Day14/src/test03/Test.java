package test03;

public class Test {
	public static void main(String[] args) {
		Shape s = new Shape(5, 10);
		Circle c = new Circle(10);
		System.out.println(calcArea(c));
	}

	public static double calcArea(Shape s) {
		double result = s.getArea();
		return result;
	}
}
