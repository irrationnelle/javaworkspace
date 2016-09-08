package programming05;

public class Test {
	public static void main(String[] args) {
		Shape[] s = new Shape[3];
		s[0] = new Ellipse(2, 3);
		s[1] = new Rectangle(2, 3);
		s[2] = new Triangle(2, 3);

		double[] result = calc(s);
		for(int i=0; i<result.length; i++) {
			System.out.println(result[i]);
		}
	}
	
	public static double[] calc(Shape[] s) {
		double[] result = new double[s.length];
		for(int i=0; i<s.length; i++) {
			result[i] = s[i].getArea();
		}
		return result;
	}
}
