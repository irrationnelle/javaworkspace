package programming05;

public class Test {
	public static void main(String[] args) {
		Shape[] s = new Shape[6];
		s[0] = new Ellipse(2, 3);
		s[1] = new Rectangle(2, 3);
		s[2] = new Triangle(2, 3);
		s[3] = new Sphere(3);
		s[4] = new Cube(3, 3, 3);
		s[5] = new Cylinder(2, 3);

		double[] result = calc(s);
		for(int i=0; i<result.length; i++) {
			System.out.println(s[i]);
			System.out.println(result[i]);
		}
	}
	
	public static double[] calc(Shape[] s) {
		double[] result = new double[s.length];
		for(int i=0; i<s.length; i++) {
			if(s[i] instanceof TwoDimShape) {
				result[i] = s[i].getArea();
			} else if(s[i] instanceof ThreeDimShape) {
				result[i] = s[i].getVolume();
			}
		}
		return result;
	}
}
