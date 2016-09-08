package programming05;

public class TwoDimShape extends Shape {
	//TwoDimShape Ŭ������ width�� height�� �����ϴ� ����
	// Ÿ�� Ŭ���� ���� ��� ���� �ǹ̰� ���� ������
	// ���� ������ ���� �ʴ� ���� ����.
	// ���� ����δ� �� ����
	private int width;
	private int height;
	
	public TwoDimShape() {
		super();
	}
	
	public TwoDimShape(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	public double getArea() {
		// �̷� ������ getArea()�� �����ϴ� ���� �߸���
		// ���� return 0; �� �δ� ���� ����.
		return (double)(width*height);
	}
}
