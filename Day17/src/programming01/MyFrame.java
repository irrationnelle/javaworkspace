package programming01;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyFrame extends JFrame {
	private JPanel pl1 = new JPanel();
	private JPanel pl2 = new JPanel();
	private JPanel pl3 = new JPanel();
	private JLabel label = new JLabel("�Ÿ��� ���� ������ �Է��Ͻÿ�.");
	private JButton button = new JButton("Convert");
	private JTextField text1 = new JTextField("1          ");
	private JTextField text2 = new JTextField("1������ 1.6 ų�ι����Դϴ�.");
	
	public MyFrame() {
		// TODO Auto-generated constructor stub
		setTitle("From Mile To KM");
		setSize(300, 150);
		
		pl1.add(label);
		pl1.add(text1);
		pl2.add(button);
		pl3.add(text2);
		
		add(pl1, BorderLayout.PAGE_START);
		add(pl2, BorderLayout.CENTER);
		add(pl3, BorderLayout.PAGE_END);
		setVisible(true);
	}
}
