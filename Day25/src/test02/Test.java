package test02;

public class Test {
	public static void main(String[] args) {
		//run( )�޼ҵ尡 new MyThread( )�� �ִٴ� �� �˸��� ���� ���ڷ� ������.
		Thread t = new Thread(new MyThread());
		t.start();
		
		for(int i=0; i<1000000; i++) {
			System.out.println("mian i: "+i);
		}
	}
}
