import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		int score;
		char grade;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("input your score: ");
		score = input.nextInt();
		
		if(score >= 50) {
			grade = 'A';
		}
		else {
			grade = 'B';
		}
		
		System.out.println("Your grade is "+grade);
	}
}
