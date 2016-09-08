package test02;

public class Test {
	// CONSIDER a polymorphism
	public static void main(String[] args) {
//		Rectangle r = new Rectangle(10, 20);
//		Triangle t = new Triangle(10, 20);
//		Circle c = new Circle(10);
//		
//		System.out.println(r.getArea());
//		System.out.println(t.getArea());
//		System.out.println(c.getArea());

		// CONSIDER a polymorphism
		Shape[] shapes = new Shape[3];
		shapes[0] = new Rectangle(10, 20);
		shapes[1] = new Triangle(10, 20);
		shapes[2] = new Circle(10);
		 
		/* *** Use the polymorphism ***
		 * type가 동일하기 때문에 shapes라는 배열로 선언 가능
		 * 하지만 자식 객체들이 오버라이딩한 메소드들은
		 * 각자 따로 오버라이딩으로 재정의된 기능을 실행
		 */
		for(int i=0; i<shapes.length; i++) {
			System.out.println(shapes[i].getArea());
		}
	}
}
