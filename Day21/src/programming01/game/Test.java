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
			System.out.println("��� �ֻ��� ��: "+human.getValue());
			computer.setValue(computer.roll());
			System.out.println("��ǻ�� �ֻ��� ��: "+computer.getValue());
			
			if(human.getValue() > computer.getValue()) {
				System.out.println("����� �̰���ϴ�.");
			} else if(human.getValue() < computer.getValue()) {
				System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
			} else {
				System.out.println("���� �����ϴ�.");
			}
		}
	}
}
