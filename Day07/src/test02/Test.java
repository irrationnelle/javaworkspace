package test02;

public class Test {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.speed = 100;
		myCar.model = "Sonata";
		
		myCar.speedUp(5);
		myCar.speedUp(10);
		
		
		String result = myCar.toString();
		
		System.out.println(result);
	}
}
