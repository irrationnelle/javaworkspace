import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("input your score: ");
		int score = input.nextInt();
		
		char grade;
		
		if(score >= 70) {
			grade = 'A';
		}
		else if(score < 40) {
			grade = 'C';
		}
		else {
			grade = 'B';
		}
		
		System.out.println("Your grade is "+grade);
		
	}
}
