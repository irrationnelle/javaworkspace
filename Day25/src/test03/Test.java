package test03;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("main start!");
		
		MyThread t = new MyThread();
		System.out.println("10 ī��Ʈ �����带 ����");
		
		t.start();
		
		System.out.println("2�� ��ٸ��� �����带 ������ ����");
		
		// main ������� interrupt ���� ���� ���� ���⿡ ���� ����
		Thread.sleep(2000); 
		
		t.interrupt();
		// t.join�� �ɸ� interrupt �� �����尡 ����� ���Ŀ�, �� interrupt �Ǳ⸦ ����ߴٰ� main �����尡 ����
//		t.join(3000);
		System.out.println("���� ����");
	}
}
