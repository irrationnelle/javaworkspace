import java.util.Scanner;

public class Test08 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("input your score: ");
		int score = input.nextInt();
		int criteria = score/10;
		char level;
				
		switch(criteria) {
		case 10:
		case 9:
		case 8:
			level = 'A';
			break;
		case 7:
		case 6:
			level = 'B';
			break;
		case 5:
		case 4:
			level = 'C';
			break;
		case 3:
		case 2:
		case 1:
		case 0:
			level = 'D';
			break;
		default:
			level = 'F';
		}
		
		System.out.println("Your level is "+level);
	}
}
