package test04;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�迭 ���� �Է�: ");
		int arraySize = scan.nextInt();
		int[] numbers = new int[arraySize];
		
		for(int i=0; i<numbers.length; i++) {
			System.out.print("���� "+(i+1)+" �Է�: ");
			numbers[i] = scan.nextInt();
		}
		
		int sum=0;
		
		
		for(int i=0; i<numbers.length; i++) {
			sum += numbers[i];
		}
		System.out.println("�հ�="+sum);
		System.out.println("���="+(sum/numbers.length));
		
	}
}
