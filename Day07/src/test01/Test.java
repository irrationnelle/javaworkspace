package test01;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Car c; // 인스턴스 생성
		c = new Car();
		
		System.out.print("input speed: ");
		c.speed = scan.nextInt();
		c.mileage = 100000;
		c.model = "Sonata";
		c.echo = true;
		
		c.printCarStatus();
		
		Car c2 = new Car();
		
		c2.speed = 200;
		c2.mileage = 0;
		c2.echo = false;
		c2.model = "Morning";
		
		c2.printCarStatus();
	}
}
