package test03;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFrame extends JFrame {
	private JButton count = new JButton("Count");
	private JButton reset = new JButton("Reset");
	private JPanel pl1 = new JPanel();
	private JPanel pl2 = new JPanel();
	private JPanel totalPanel = new JPanel();
	private int num = 0;
	private JLabel label = new JLabel(Integer.toString(num));
	
	public MyFrame() {
		label.setFont(new Font("Consolas", Font.PLAIN, 100));
		count.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				num++;
				label.setText(Integer.toString(num));
			}
		});
		
		reset.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				num=0;
				label.setText(Integer.toString(num));
			}
		});
		
		pl1.setLayout(new FlowLayout(FlowLayout.CENTER));
		pl1.add(label);
		pl2.setLayout(new GridLayout(1, 2));
		pl2.add(count);
		pl2.add(reset);
		
		totalPanel.setLayout(new BorderLayout());
		totalPanel.add(pl1, BorderLayout.PAGE_START);
		totalPanel.add(pl2, BorderLayout.PAGE_END);
		
		add(totalPanel);
		
		setTitle("Counter");
		setSize(300, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
}
