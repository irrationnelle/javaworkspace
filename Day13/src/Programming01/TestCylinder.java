package Programming01;

public class TestCylinder {
	public static void main(String[] args) {
		Cylinder obj1 = new Cylinder();
		
		System.out.println(obj1.getRadius());
		System.out.println(obj1.getHeight());
		
		Cylinder obj2 = new Cylinder(5.0, 3.0);
		System.out.println(obj2.getRadius());
		System.out.println(obj2.getHeight());
	}
}
