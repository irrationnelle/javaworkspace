package Programming03;

import java.util.Scanner;

public class Test {
	static Scanner scan = new Scanner(System.in); 
	
	public static void main(String[] args) {
		System.out.print("x�� �Է�: ");
		int x = scan.nextInt();
		System.out.print("y�� �Է�: ");
		int y = scan.nextInt();
		
		Shape shape = new Shape(x, y);
		System.out.println(shape.getHeight());
		System.out.println(shape.getWidth());
		
		Triangle tri = new Triangle(x, y);
		System.out.println("���� ����: "+tri.getHypotenuse());
		System.out.println("�ﰢ�� ����: "+tri.getArea());
		System.out.println("�ﰢ�� �ѷ�: "+tri.getSize());
	}
}
