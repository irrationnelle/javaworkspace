import java.util.Scanner;

public class Test14 {
	// 삼항연산자 연습문제2
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("input your score: ");
		int score = input.nextInt();
		
		char level = (score >= 70)? 'A' : ((score < 40)? 'C' : 'B');
		System.out.println("Your score is "+level);
	}

}
