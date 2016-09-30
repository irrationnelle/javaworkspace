package test01;

public class Test {
	public static void main(String[] args) {
		MyThread t = new MyThread();
		
		/*
		t.run(); // 이렇게 실행할 경우 해당 쓰레드만 계속 돌아가고 있다.
		*/
		
		t.start(); // 이 경우 번갈아가면서 스레드와 메인 스레드가 사용.
		
		for(int i=0; i<1000000; i++) {
			System.out.println("main i: "+i);
		}
	}
}
