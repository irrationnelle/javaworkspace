package ex02;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class CountDownTest extends JFrame {
	private JLabel label = new JLabel("Start");
	
	public CountDownTest() {
		label.setFont(new Font("Consolas", Font.BOLD, 80));
		add(label);
		(new MyThread()).start();
		
		setSize(300, 200);
		setTitle("Count Down Test");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	class MyThread extends Thread {
		@Override
		public void run() {
			for(int i=10; i>0; i--) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				label.setText(i+"");
			}
		}
	}
}
