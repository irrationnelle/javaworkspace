import java.util.Scanner;

public class Test13 {
	// 삼항연산자 연습문제 1
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("input your score: ");
		int score = input.nextInt();
		
		char level = (score >= 50) ? 'A' : 'B';
		System.out.println("Your score is "+level);
	}

}
