package test03;

import java.util.Random;
import java.util.Scanner;

public class DiceGame {
	private int randomNumber; // ���� ���ڰ� ����� ����
	private int userGuess; // ����� �Է� ���� ������ ����
	
	private void rollDice() {
//		randomNumber = (int)(Math.random()*10)+1;
		randomNumber = new Random().nextInt(10)+1;
	}
	
	private void inputUserGuess() {
		Scanner scan = new Scanner(System.in);
		System.out.print("�����ϴ� ���� �Է�: ");
		userGuess = scan.nextInt();
	}
		
	private void checkAnswer() {
		if(randomNumber == userGuess) {
			System.out.println("���߼̽��ϴ�!! �����մϴ�!!");
		} else {
			System.out.println("Ʋ�Ƚ��ϴ�.. ������ "+randomNumber+"�Դϴ�");
		}
	}
	
	public void startGame() {
		rollDice();
		inputUserGuess();
		checkAnswer();
	}
}
