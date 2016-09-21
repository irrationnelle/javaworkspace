package programming01;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyFrame extends JFrame {
	private JPanel pl1 = new JPanel();
	private JPanel pl2 = new JPanel();
	private JPanel pl3 = new JPanel();
	private JLabel label = new JLabel("거리를 마일 단위로 입력하시오.");
	private JButton button = new JButton("Convert");
	private JTextField text1 = new JTextField("              ");
	private JTextField text2 = new JTextField("              ");
	private double mile=0;
	
	public MyFrame() {
		// TODO Auto-generated constructor stub
		setTitle("From Mile To KM");
		setSize(300, 150);
		
		pl1.add(label);
		pl1.add(text1);
		pl2.add(button);
		pl3.add(text2);
		
		text1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setMile(Double.parseDouble(text1.getText()));
				text2.setText(Double.toString((1.6*getMile())));
				text1.setText("");
			}
		});
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				setMile(Double.parseDouble(text1.getText()));
				text2.setText(Double.toString((1.6*getMile())));
				text1.setText("");
			}
		});
		
		pl3.setLayout(new GridLayout(1, 1));
		add(pl1, BorderLayout.PAGE_START);
		add(pl2, BorderLayout.CENTER);
		add(pl3, BorderLayout.PAGE_END);
		setVisible(true);
	}

	public double getMile() {
		return mile;
	}

	public void setMile(double mile) {
		this.mile = mile;
	}
}
