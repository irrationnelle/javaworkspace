package Programming04;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		final int HEXA = 16;
		
		String[] hexa2bin = new String[HEXA];
//		String[]  hexa2bin = {
//				"0000", "0001", "0010", "0011",
//				"0100", "0101", "0110", "0111",
//				"1000", "1001", "1010", "1011",
//				"1100", "1101", "1110", "1111"
//		};
		for(int i=0; i<hexa2bin.length; i++) {
			hexa2bin[i] = new String("0000");
		}
		
//		Scanner scan = new Scanner(System.in);
//		System.out.print("16진수 입력: ");
//		String input = scan.next();
//		
//		for(int i=0; i<input.length(); i++) {
//			if(input.charAt(i) >= '0' && input.charAt(i) <='9') {
//				System.out.print(hexa2bin[(input.charAt(i)-48)]+" ");
//			} else if (input.charAt(i) >= 'a' && input.charAt(i) <='f') {
//				System.out.print(hexa2bin[(input.charAt(i)-87)]+" ");
//			}
//		}
		
		
		for(int i=0; i<hexa2bin.length; i++) {
			for(int j=0; j<4; j--) {
				int num = HEXA-1;
				if(num/2 == 0) {
					//charAt은 출력만 가능하고 입력은 불가능.
					hexa2bin[i].charAt(j) = (char)(num%2); 
				}
				num /= 2;
			}
		}
		
		for(int i=0; i<hexa2bin.length; i++) {
			System.out.println(hexa2bin[i]);
		}
		
	}
}
