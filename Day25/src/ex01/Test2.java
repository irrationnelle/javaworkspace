package ex01;

public class Test2 {
	public static void main(String[] args) {
		MyThread t1 = new MyThread("A");
		MyThread t2 = new MyThread("B");
		
		t1.start();
		t2.start();
	}
}
