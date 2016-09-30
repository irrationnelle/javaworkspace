package test02;

public class Test {
	public static void main(String[] args) {
		//run( )메소드가 new MyThread( )에 있다는 걸 알리기 위해 인자로 전달함.
		Thread t = new Thread(new MyThread());
		t.start();
		
		for(int i=0; i<1000000; i++) {
			System.out.println("mian i: "+i);
		}
	}
}
