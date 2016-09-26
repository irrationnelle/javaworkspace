package test08;

public class Test {
	public static void main(String[] args) {
		countDown();
	}
	
	public static void countDown() throws InterruptedException {
		for(int i=10; i>0; i--) {
			System.out.println("카운트: "+i);
			Thread.sleep(1000);	// for문에서 delay를 주고 싶을 때 사용
		}
		System.out.println("발사!!");
	}
}
