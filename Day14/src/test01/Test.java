package test01;

public class Test {
	public static void main(String[] args) {
		Car c = new SportsCar();
		((SportsCar)c).childMethod();
		
		c.printCar();
	}
}
