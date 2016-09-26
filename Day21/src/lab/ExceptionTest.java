package lab;

import java.util.Scanner;

public class ExceptionTest {
	public static void main(String[] args) {
		int[] list;
		int sum=0, count;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("How many of integers: ");
		try {
			count = sc.nextInt();
			list = new int[count];
			
			for(int i=0; i<count; i++) {
				System.out.print("input integer: ");
				list[i] = sc.nextInt();
			}
			
			for(int i=0; i<count; i++) {
				sum += list[i];
			}
			
			System.out.println("Avg is "+(sum/count));
		} catch (NegativeArraySizeException e) {
			System.out.println("Array Size must be Positive Number");
			e.getMessage();		
		} catch(ArithmeticException e) {
			System.out.println("You cannot devide by 0");
			e.getMessage();
		}
	}
}
