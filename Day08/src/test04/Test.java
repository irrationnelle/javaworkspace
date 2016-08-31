package test04;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("배열 길이 입력: ");
		int arraySize = scan.nextInt();
		int[] numbers = new int[arraySize];
		
		for(int i=0; i<numbers.length; i++) {
			System.out.print("숫자 "+(i+1)+" 입력: ");
			numbers[i] = scan.nextInt();
		}
		
		int sum=0;
		
		
		for(int i=0; i<numbers.length; i++) {
			sum += numbers[i];
		}
		System.out.println("합계="+sum);
		System.out.println("평균="+(sum/numbers.length));
		
	}
}
