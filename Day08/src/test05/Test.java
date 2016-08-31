package test05;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("input array size: ");
		int arraySize = scan.nextInt();
		
		int[] array = new int[arraySize];
		
		for(int i=0; i<array.length; i++) {
			System.out.print("input "+(i+1)+"th array element: ");
			array[i] = scan.nextInt();
		}
		
		for(int i=0; i<array.length; i++) {
			array[i] *=2;
		}
		
		for(int num:array) {
			System.out.println(num);
		}
	}
}
