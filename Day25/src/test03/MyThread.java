package test03;

public class MyThread extends Thread {
	@Override
	public void run() {
		try {
			for(int i=0; i<10; i++) {
				System.out.println(i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println("9���� ���� ���� ���� ����!");
			e.printStackTrace();
		}
		System.out.println("MyThread ����.");
	}
}
