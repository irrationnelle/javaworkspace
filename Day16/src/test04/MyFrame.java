package test04;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFrame extends JFrame {
	private JPanel panel = new JPanel();
	private JButton btn = new JButton("Button");
	private JButton btn2 = new JButton("Button2");
	private JLabel lb = new JLabel("This is Label");
	
	public MyFrame() {
		setLayout(new FlowLayout());
		
		panel.setSize(150, 150);
		panel.setBackground(Color.WHITE);
		panel.add(btn); //�гο� ��ư�� ���̰�
		panel.add(btn2);
		panel.add(lb);
		
		btn2.setEnabled(false);
		
		add(panel); // �����ӿ� �г��� ���δ�.
		
		setResizable(true); // â ũ�� ����
		setSize(300, 200);
		setTitle("Fourth Title");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
}
