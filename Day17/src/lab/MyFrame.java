package lab;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame extends JFrame {
	JPanel pl = new JPanel();
	
	public MyFrame() {
		// TODO Auto-generated constructor stub
		setSize(300, 200);
		setTitle("My Frame");
		pl.setLayout(new GridLayout(0, 4));
		for(int i = 0; i<10; i++) {
			pl.add(new JButton("Button"+i));
		}
		add(pl);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
}
