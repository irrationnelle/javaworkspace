package Programming01;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input=1;
		int[] sit = new int[10];
		for(int i=0; i<sit.length; i++) {
			sit[i] = 0;
		}
		
		while(input!=0) {
			System.out.print("좌석을 예약하시겠습니까?(Yes:1, No:0) ");
			input = scan.nextInt();
			
			if(input == 0) {
				break;
			}
			System.out.println("현재의 예약상태는 다음과 같습니다.");
			System.out.println("--------------------------------");
			System.out.println("1 2 3 4 5 6 7 8 9 10");
			System.out.println("--------------------------------");
			for(int i=0; i<sit.length; i++) {
				System.out.print(sit[i]+" ");
			}
			System.out.println();
			System.out.println("몇번째 좌석을 예약하시겠습니까?");
			input = scan.nextInt();
			sit[(input-1)] = 1;
			System.out.println("예약되었습니다.");
		}
	}
}
