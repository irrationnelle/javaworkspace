package Programming03;

public class Dice {
	private int face;

	public int getFace() {
		System.out.print("주사위 값: ");
		return face;
	}

	public void roll() {
		System.out.println("주사위를 굴립니다.");
		face = (int) (Math.random()*6)+1;
	}
}
