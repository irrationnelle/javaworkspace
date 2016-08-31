package Programming03;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("학생 수 입력: ");
		int studentNum = scan.nextInt();
		
		int[] student = new int[studentNum];
		int total = 0;
		
		for(int i=0; i<student.length; i++) {
			System.out.print("학생 "+(i+1)+" 성적 입력: ");
			int score = scan.nextInt();
			if(score <= 100 && score >= 0) {
				student[i] = score;
			}
			else {
				System.out.println("잘못된 입력입니다.");
				i--;
			}
		}
		
		for(int score: student) {
			total += score;
		}
		
		System.out.println("성적평균은 "+((double) total/ (double) studentNum)+"입니다.");
	}
}
