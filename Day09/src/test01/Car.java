package test01;

public class Car {
	// �⺻ �������� Ŭ���� ������ �ʵ��� �ʱ�ȭ�� ����
	/*
	 * 	new Ű����� �ν��Ͻ��� �����ϸ�
	 *  ������ �ν��Ͻ��� �ʵ尪�� �Ʒ��� ���� ������.
	 */
	public int speed = 0;
	public String color = "WHITE";
	public String model = "Citroen";
	
	public void speedUp() {
		speed += 10;
	}
	
	public void speedDown() {
		speed -= 10;
	}
	
	public String toString() {
		return "����:"+color+", ��:"+model+", ����ӵ�:"+speed;
	}
}
