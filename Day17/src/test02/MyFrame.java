package test02;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame extends JFrame {
	private JButton red = new JButton("Red");
	private JButton blue = new JButton("Blue");
	private JPanel panel = new JPanel();
	
	public MyFrame() {
		red.setFont(new Font("Consolas", Font.PLAIN, 15));
		blue.setFont(new Font("Consolas", Font.PLAIN, 15));
		
		Listener listener = new Listener();
		red.addActionListener(listener);
		blue.addActionListener(listener);
		
		panel.add(red);
		panel.add(blue);
		
		panel.setBackground(Color.RED);
		
		setTitle("Red and Blue");
		setSize(300, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		add(panel);
		setVisible(true);
	}
	
	class Listener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource() == red) {
				panel.setBackground(Color.RED);
			} else if(e.getSource() == blue) {
				panel.setBackground(Color.BLUE);
			}
		}
		
	}
			
}
