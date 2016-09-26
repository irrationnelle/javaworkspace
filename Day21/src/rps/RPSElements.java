package rps;

public class RPSElements {
	public static final int rock = 0;
	public static final int paper = 1;
	public static final int scissors = 2;
	public static int value;
	
	public int cast() {
		while(true) {
			int cast = (int) (Math.random()*10);
			if(cast <= 2) {
				return cast;
			}
		}
	}
	
	public String getRPS() {
		value = cast();
		switch(value) {
		case rock:
			return "Rock";
		case paper:
			return "Paper";
		case scissors:
			return "Scissors";
		default:
			return null;
		}
	}
	
	public String getRPS(int input) {
		int value = input;
		switch(value) {
		case rock:
			return "Rock";
		case paper:
			return "Paper";
		case scissors:
			return "Scissors";
		default:
			return null;
		}
	}
	
	static public String getResult(int input) {
		if(input == 0 && value == 2) {
			return "You win!";
		} else if(input > value) {
			return "You win!";
		} else if(input == value) {
			return "Draw";
		} else {
			return "Computer win";
		}
	}
}
