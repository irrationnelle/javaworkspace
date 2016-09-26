package test09;

public class Test {
	public static void main(String[] args) {
		Car c1 = new Car(280, "WHITE", "Citroen");
		
		try {
			c1.speedUp();
			System.out.println(c1.getSpeed());
			c1.speedUp();
			System.out.println(c1.getSpeed());
			c1.speedUp();
			System.out.println(c1.getSpeed());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			System.out.println("Program end");
		}
	}
}
