package ex01;

public class Myrunnable implements Runnable{
	private String name;
	
	public Myrunnable(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i<100000; i++) {
			System.out.print(name+": "+i+", ");
		}
		
	}

}
