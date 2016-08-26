// hint: 10으로 나눈 뒤 몫과 나머지를 System.out.print();로 출력할 것

import java.util.Scanner;

public class Notepad04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("input number: ");
		int num = input.nextInt();

		System.out.print("Reversed number: ");
		while(true) {
			System.out.print(num%10);
			num /= 10;
			if(num==0)
				break;
		}
				
	}
}
