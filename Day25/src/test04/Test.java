package test04;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("main 시작");
		MyThread t = new MyThread();
		
		t.start();
		
		Thread.sleep(2000);
		
		t.setRun(false);
		System.out.println("main 종료");
	}
}
