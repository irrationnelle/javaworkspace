package programming01.game;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Die human = new Die();
		Die computer = new Die();
		
		boolean isStart = true;
		while(isStart) {
			System.out.print("0 -> Exit: ");
			int start = scan.nextInt();
			if(start == 0) {
				break;
			}
			human.setValue(human.roll());
			System.out.println("당신 주사위 값: "+human.getValue());
			computer.setValue(computer.roll());
			System.out.println("컴퓨터 주사위 값: "+computer.getValue());
			
			if(human.getValue() > computer.getValue()) {
				System.out.println("당신이 이겼습니다.");
			} else if(human.getValue() < computer.getValue()) {
				System.out.println("컴퓨터가 이겼습니다.");
			} else {
				System.out.println("서로 비겼습니다.");
			}
		}
	}
}
