package test06;

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
	
	public MyFrame() {
		// ��ġ�����ڸ� �������� ���� ��, JFrame�� BorderLayout�� �⺻
		// JPanel�� FlowLayout�� �⺻
		setLayout(null); // ���� ��ǥ ����
		setResizable(false);
		
		add(btn01);
		add(btn02);
		add(btn03);
		
		btn01.setBounds(0, 0, 100, 50);
		btn02.setBounds(0, 200, 100, 100); // ũ�� ������ �ؾ� ��������.
		btn03.setBounds(50, 200, 200, 200);
		
		setSize(500,400);
		setTitle("sixth Title");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
}
