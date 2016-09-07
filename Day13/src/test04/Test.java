package test04;

public class Test {
	public static void main(String[] args) {
		Car c = new Car();
		
		SportsCar sc = new SportsCar();
		
		Car.n++;
		System.out.println(Car.n);
		
		System.out.println(SportsCar.n);
		sc.n++;
		
		System.out.println(Car.n);
		
		System.out.println(SportsCar.n);
	}
}
