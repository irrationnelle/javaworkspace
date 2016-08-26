// hint: 10으로 나눈 뒤 몫과 나머지를 System.out.print();로 출력할 것

import java.util.Scanner;

public class Notepad04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("input number: ");
		int num = input.nextInt();
		
		int count = 0;
		
		while(true) {
			num /= 10;
			count++;
			if(num==0)
				break;
		}
		
		int total = 0;
		for(int i=1; i<count; i++) {
			for(int j=1; j<count; j++) {
				num /= 10;
			}
			
			for(int j=0; j<i; j++)
			
		}
	}
}
