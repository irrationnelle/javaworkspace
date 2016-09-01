package test03;

import java.util.Random;
import java.util.Scanner;

public class DiceGame {
	private int randomNumber; // 랜덤 숫자가 저장될 변수
	private int userGuess; // 사용자 입력 숫자 저장할 변수
	
	private void rollDice() {
//		randomNumber = (int)(Math.random()*10)+1;
		randomNumber = new Random().nextInt(10)+1;
	}
	
	private void inputUserGuess() {
		Scanner scan = new Scanner(System.in);
		System.out.print("추측하는 숫자 입력: ");
		userGuess = scan.nextInt();
	}
		
	private void checkAnswer() {
		if(randomNumber == userGuess) {
			System.out.println("맞추셨습니다!! 축하합니다!!");
		} else {
			System.out.println("틀렸습니다.. 정답은 "+randomNumber+"입니다");
		}
	}
	
	public void startGame() {
		rollDice();
		inputUserGuess();
		checkAnswer();
	}
}
