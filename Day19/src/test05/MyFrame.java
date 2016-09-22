package test05;

import javax.swing.JFrame;

public class MyFrame extends JFrame {
	private MyPanel panel = new MyPanel();
	
	public MyFrame() {
		// TODO Auto-generated constructor stub
		add(panel);
		
		setSize(300, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		MyFrame f = new MyFrame();
	}
}
