package Programming02;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 배열 크기 설정
		final int ARRAY_SIZE = 10;
		
		// 배열 값(* 개수) 초기화
		int[] array = new int[ARRAY_SIZE];
		for(int i=0; i<array.length; i++) {
			array[i] = 0;
		}
		
		// 배열 값(* 개수) 구하기 위한 for문
		for(int i=0; i<ARRAY_SIZE; i++) {
			System.out.print((i+1)+"번째 숫자 입력: ");
			int num = scan.nextInt();
			if(num%10 == 0) {
				num /= 10;
				array[num-1]++;
			}
			else {
				num /= 10;
				array[num]++;
			}
		}
		
		int loopNum=1; // 1 - 10, 11 - 21, ... 나타내기 위한 변수
		// 배열 값(* 개수) 기반으로 * 출력
		for(int i=0; i<array.length; i++) {
			System.out.print(loopNum+" - "+(loopNum+9)+": ");
			for(int j=0; j<array[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
			loopNum += 10;
		}
		
	}
}
