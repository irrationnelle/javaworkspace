package test01;

public class MyThread extends Thread {
	@Override
	public void run() {
		//���� Ŭ������ ������ ������ ��ü�� �ؾ� �ϴ� �۾� ����.
		for(int i=0; i<10000000; i++) {
			System.out.println("Thread i: "+i);
		}
	}
}
