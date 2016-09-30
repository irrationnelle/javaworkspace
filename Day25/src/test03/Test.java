package test03;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("main start!");
		
		MyThread t = new MyThread();
		System.out.println("10 카운트 스레드를 시작");
		
		t.start();
		
		System.out.println("2초 기다리고 스레드를 방해할 것임");
		
		// main 스레드는 interrupt 당할 일이 거의 없기에 예외 던짐
		Thread.sleep(2000); 
		
		t.interrupt();
		// t.join을 걸면 interrupt 한 스레드가 종료된 이후에, 즉 interrupt 되기를 대기했다가 main 스레드가 진행
//		t.join(3000);
		System.out.println("메인 종료");
	}
}
