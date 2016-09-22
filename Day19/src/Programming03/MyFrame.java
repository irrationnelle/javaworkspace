package Programming03;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame extends JFrame {
	MyPanel panel = new MyPanel();
//	MyPanel buttonPanel = new MyPanel();
	
	public MyFrame() {
		
//		buttonPanel.setLayout(new GridLayout(1, 2));
//		buttonPanel.add(buttonPanel.getLeftBtn());
//		buttonPanel.add(buttonPanel.getRightBtn());
		add(panel, BorderLayout.CENTER);
//		panel.setButton();
//		add(buttonPanel, BorderLayout.PAGE_END);
		
		setSize(400, 150);
		setTitle("Moving Bar");
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		MyFrame f = new MyFrame();
	}
}
