package test02;

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
		if(speed<300) 
			speed += 10;
	}
	
	public void speedDown() {
		if(speed >= 10)
			speed -= 10;
	}
	
	public String toString() {
		return "����:"+color+", ��:"+model+", ����ӵ�:"+speed;
	}
	
	// private���� ����� �ʵ� color�� ���� �ܺο��� �����ϱ� ����
	public void setColor(String c) {
		color = c;
	}

	// private���� ����� �ʵ� color�� ���� �ܺο��� �����ٰ� ����ϱ� ����	
	public String getColor() {
		return color;
	}
	
	public void setModel(String m) {
		model = m;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setSpeed(int s) {
		speed = s;
	}
	
	public int getSpeed() {
		return speed;
	}
}
