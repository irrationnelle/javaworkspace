package Programming03;

import java.util.Scanner;

public class Test {
	static Scanner scan = new Scanner(System.in); 
	
	public static void main(String[] args) {
		System.out.print("x값 입력: ");
		int x = scan.nextInt();
		System.out.print("y값 입력: ");
		int y = scan.nextInt();
		
		Shape shape = new Shape(x, y);
		System.out.println(shape.getHeight());
		System.out.println(shape.getWidth());
		
		Triangle tri = new Triangle(x, y);
		System.out.println("빗변 길이: "+tri.getHypotenuse());
		System.out.println("삼각형 넓이: "+tri.getArea());
		System.out.println("삼각형 둘레: "+tri.getSize());
	}
}
