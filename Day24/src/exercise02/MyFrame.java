package exercise02;

import java.awt.BorderLayout;
import java.awt.Component;
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
	private JPanel countPanel = new JPanel(); 
	private JPanel btnPanel = new JPanel();
	private JLabel countNum = new JLabel("0");
	private JLabel oddevenShow = new JLabel("짝수입니다.");
	private JButton count = new JButton("Count");
	private JButton reset = new JButton("Reset");
	private int num=0;
	
	public MyFrame() {
		countNum.setAlignmentX(Component.CENTER_ALIGNMENT);
		oddevenShow.setAlignmentX(Component.CENTER_ALIGNMENT);
		countPanel.setLayout(new BoxLayout(countPanel, BoxLayout.Y_AXIS));
		countPanel.add(countNum);
		countPanel.add(oddevenShow);
		btnPanel.setLayout(new GridLayout(1, 2));
		btnPanel.add(count);
		btnPanel.add(reset);
		
		
		countNum.setFont(new Font("Consolas", Font.BOLD, 100));
		oddevenShow.setFont(new Font("굴림", Font.PLAIN, 30));

		add(countPanel, BorderLayout.CENTER);
		add(btnPanel, BorderLayout.PAGE_END);
		
		count.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				num++;
				countNum.setText(Integer.toString(num));
				if(num%2==0) {
					oddevenShow.setText("짝수입니다.");
				} else {
					oddevenShow.setText("홀수입니다.");
				}
				repaint();
			}
		});
		reset.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				num = 0;
				countNum.setText(Integer.toString(num));
				oddevenShow.setText("짝수입니다.");
				repaint();
			}
		});
		
		setSize(250,250);
		setTitle("카운트 그래픽 프로그램");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
}
