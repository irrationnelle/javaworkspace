package test03;

public class Test {
	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2;
		
		c2 = c1;
		/*
		 * �̹� c1�� Car �ڷ����� ������ ���� �����̱� ������
		 * ������ ���������� c2�� c1�� �ּҰ��� �����Ѵ�.
		 */
		
		c1.speed = 100;
		c1.model = "Audi";
		
		System.out.println(c2.toString());
		
		c1 = null;
		
	}
}
