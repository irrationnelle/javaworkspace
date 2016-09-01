package Programming01;

public class CircleTest {
	public static void main(String[] args) {
		Circle c = new Circle();
		c.setCx(0);
		c.setCy(0);
		c.setRad(5);
		
		System.out.println(c.area());
	}
}
