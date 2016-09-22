package lab;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class MyFrame extends JFrame {
	MyPanel panel = new MyPanel();
	
	public MyFrame() {
		// TODO Auto-generated constructor stub
		
		add(panel);
		
		setSize(300, 450);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		MyFrame f = new MyFrame();
	}
}
