package rps;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		RPSElements human = new RPSElements();
		RPSElements computer = new RPSElements();
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.print("Rock(0) Paper(1) Scissors(2): ");
			int input = scan.nextInt();
			
			System.out.println("You choose "+human.getRPS(input));
			System.out.println("Computer choose "+computer.getRPS());
			
			System.out.println(RPSElements.getResult(input));
		}
	}
}
