package test01;

public class MyThread extends Thread {
	@Override
	public void run() {
		//현재 클래스로 생성된 쓰레드 객체가 해야 하는 작업 적기.
		for(int i=0; i<10000000; i++) {
			System.out.println("Thread i: "+i);
		}
	}
}
