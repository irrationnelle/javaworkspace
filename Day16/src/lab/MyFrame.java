package lab;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFrame extends JFrame {
	private JPanel panel = new JPanel();
	private JPanel panelA = new JPanel();
	private JPanel panelB= new JPanel();
	private JLabel label = new JLabel(
			"�ڹ� ���ڿ� ���� �� ȯ���մϴ�. ������ ������ �����Ͻÿ�.");
	private JButton btn1 = new JButton("�����Ը��� ����");
	private JButton btn2 = new JButton("����δ� ����");
	private JButton btn3 = new JButton("�޺���̼� ����");
	
	public MyFrame() {
		setSize(600, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyFrame");
		
		panelA.add(label);
		panelB.add(btn1);
		panelB.add(btn2);
		panelB.add(btn3);
		
		panel.add(panelA);
		panel.add(panelB);
		
		add(panel);
		
		panelA.setBackground(Color.WHITE);
		panelB.setBackground(Color.BLACK);
		
		
		setVisible(true);
	}
}
