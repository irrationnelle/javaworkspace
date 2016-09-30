package test04;

public class MyThread extends Thread {
	private boolean isRun = false;
	
	public void setRun(boolean isRun) {
		this.isRun = isRun;
	}
	
	@Override
	public void run() {
		isRun = true;
		int i=0;
		while(isRun) {
			System.out.println("Thread i: "+i);
			i++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Thread run Á¾·á!");
	}
}
