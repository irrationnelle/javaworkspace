package test01;

public class Test {
	public static void main(String[] args) {
		MyThread t = new MyThread();
		
		/*
		t.run(); // �̷��� ������ ��� �ش� �����常 ��� ���ư��� �ִ�.
		*/
		
		t.start(); // �� ��� �����ư��鼭 ������� ���� �����尡 ���.
		
		for(int i=0; i<1000000; i++) {
			System.out.println("main i: "+i);
		}
	}
}
