package Programming03;

public class Dice {
	private int face;

	public int getFace() {
		System.out.print("�ֻ��� ��: ");
		return face;
	}

	public void roll() {
		System.out.println("�ֻ����� �����ϴ�.");
		face = (int) (Math.random()*6)+1;
	}
}
