package test02;

public class MyThread implements Runnable {

	@Override
	public void run() {
		// ���� Ŭ������ ��ü �����尡 �ؾ��ϴ� �� �ۼ�
		for(int i=0; i<100000000; i++) {
			System.out.println("Thread i: "+i);
		}
	}

}
