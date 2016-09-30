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
			System.out.println("9까지 세기 전에 방해 받음!");
			e.printStackTrace();
		}
		System.out.println("MyThread 종료.");
	}
}
