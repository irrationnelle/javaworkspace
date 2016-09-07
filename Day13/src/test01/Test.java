package test01;

public class Test {
	public static void main(String[] args) {
		
		SportsCar sc = new SportsCar();
		
		sc.color = "RED";
		sc.isTurbo = true;
		sc.model = "Citroen";
		sc.speed = 100;
		sc.printCar();
		
		Car c = new Car();
		
		c.color = "BLUE";
		c.model = "BMW";
		c.speed = 200;
	}
}
