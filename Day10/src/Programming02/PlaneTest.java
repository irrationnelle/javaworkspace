package Programming02;

public class PlaneTest {
	public static void main(String[] args) {
		Plane p1 = new Plane("Korean");
		Plane p2 = new Plane("AirFrance", "AF001");
		
		System.out.println(p1.getCompany());
		System.out.println(p2.getModel());
		
		System.out.println(Plane.getPlanes());
	}
}
