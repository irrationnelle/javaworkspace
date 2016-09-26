package test06;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n1, n2;
		
		try {
			System.out.print("num1: ");
			n1 = scan.nextInt();
			System.out.print("num2: ");
			n2 = scan.nextInt();
			int result = n1/n2;
			System.out.println("result: "+result);
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Unable to input 0 at num2");
		} catch (InputMismatchException e) {
			System.out.println("Unable to input String at num1 or num2");
		} finally {		// ���ܰ� �߻��ؼ� ���α׷��� �������� �� ��� �ڿ� �ݳ������� ���. 
			System.out.println("Program End");
			
		}
		
	}
}
