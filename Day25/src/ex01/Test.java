package ex01;

public class Test {
	public static void main(String[] args) {
		Thread t1 = new Thread(new Myrunnable("A"));
		Thread t2 = new Thread(new Myrunnable("B"));
		
		t1.start();
		t2.start();
	}
}
