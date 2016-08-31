package test06;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("input array size: ");
		int arraySize = scan.nextInt();
		
		double[] arr1 = new double[arraySize];
		
		for(int i=0; i<arr1.length; i++) {
			arr1[i] = i;
		}
		
		double[] arr2 = new double[arr1.length];
		
		for(int i=0; i<arr1.length; i++) {
			arr2[i] = arr1[i];
			System.out.println(arr2[i]);
		}
		
	}
}
