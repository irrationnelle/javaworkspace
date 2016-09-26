package programming01.game;

public class Die {
	private int value;
	
	public Die() {
		this.value = 1;
	}
	
	public int roll() {
		int numDice = 7;
		while(numDice > 6 || numDice <= 0) {
			numDice = (int) (Math.random()*10); 
		}
		return numDice;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return this.value;
	}
	
	public String toString() {
		return "현재 주사위 값은 "+this.value+"입니다.";
	}
}
