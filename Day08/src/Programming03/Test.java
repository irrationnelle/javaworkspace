package Programming03;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�л� �� �Է�: ");
		int studentNum = scan.nextInt();
		
		int[] student = new int[studentNum];
		int total = 0;
		
		for(int i=0; i<student.length; i++) {
			System.out.print("�л� "+(i+1)+" ���� �Է�: ");
			int score = scan.nextInt();
			if(score <= 100 && score >= 0) {
				student[i] = score;
			}
			else {
				System.out.println("�߸��� �Է��Դϴ�.");
				i--;
			}
		}
		
		for(int score: student) {
			total += score;
		}
		
		System.out.println("��������� "+((double) total/ (double) studentNum)+"�Դϴ�.");
	}
}
