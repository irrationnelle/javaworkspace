package test05;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame extends JFrame {
	private JButton btn01 = new JButton("btn1");
	private JButton btn02 = new JButton("btn2");
	private JButton btn03 = new JButton("btn3");
	private JButton btn04 = new JButton("button04");
	private JButton btn05 = new JButton("buttonn000000005");
	
	private JPanel panel = new JPanel();
	private JPanel panel2 = new JPanel();
	
	public MyFrame() {
		// ��ġ�����ڸ� �������� ���� ��, JFrame�� BorderLayout�� �⺻
		// JPanel�� FlowLayout�� �⺻
		panel.setLayout(new GridLayout(0, 5)); // 0�� ���� ���ٴ� �� �ƴ϶� ���� �ʿ��� ��ŭ ä��ڴٴ� �ǹ�.
		
		panel.add(btn01);
		panel.add(btn02);
		panel.add(btn03);
		panel.add(btn04);
		panel.add(btn05);
		
		panel.setBackground(Color.BLACK);
		panel2.setBackground(Color.WHITE);
		
		add(panel, BorderLayout.CENTER);
		add(panel2, BorderLayout.PAGE_END);
		
		setSize(300,200);
		setTitle("Fifth Title");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
}
