package test08;

public class Test {
	public static void main(String[] args) {
		countDown();
	}
	
	public static void countDown() throws InterruptedException {
		for(int i=10; i>0; i--) {
			System.out.println("ī��Ʈ: "+i);
			Thread.sleep(1000);	// for������ delay�� �ְ� ���� �� ���
		}
		System.out.println("�߻�!!");
	}
}
