package exercise01;

import javax.swing.JFrame;

public class MyFrame extends JFrame {
	MyPanel mp = new MyPanel();
	
	public MyFrame() {
		add(mp);
		
		setSize(300, 300);
		setTitle("Snowman Face");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
}
