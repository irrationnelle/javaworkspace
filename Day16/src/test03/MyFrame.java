package test03;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	private JButton btn = new JButton("This is button.");
	
	public MyFrame() {
		setLayout(new FlowLayout());
		add(btn);
		
		setSize(300, 200);
		setTitle("Third Title");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true); // 거의 항상 가장 밑에 위치한다.
	}
}
