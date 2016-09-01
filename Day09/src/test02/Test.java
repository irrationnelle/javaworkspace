package test02;

public class Test {
	public static void main(String[] args) {
		Car c = new Car();
		
		c.speedUp();
		c.speedUp();
		c.speedUp();
		
		System.out.println(c.toString());
		
//		c.color = "RED"; // 사용불가
		c.setColor("RED");

//		System.out.println(c.color); // 사용불가
		System.out.println(c.getColor());
		
	}
}
