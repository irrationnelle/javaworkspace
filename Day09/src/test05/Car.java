package test05;

public class Car {
	// �⺻ �������� Ŭ���� ������ �ʵ��� �ʱ�ȭ�� ����
	/*
	 * 	new Ű����� �ν��Ͻ��� �����ϸ�
	 *  ������ �ν��Ͻ��� �ʵ尪�� �Ʒ��� ���� ������.
	 */
	private int speed = 0;
	private String color = "WHITE";
	private String model = "Citroen";
	
	public void speedUp() {
		// ���� ���� ���� �ʵ��� ������ �ɾ��ش�
		speed += 10;
	}

	//�޼ҵ� �����ε�
	public void speedUp(int s) {
		speed += s;
	}
	
}
