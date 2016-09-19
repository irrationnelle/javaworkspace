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
			"자바 피자에 오신 걸 환영합니다. 피자의 종류를 선택하시오.");
	private JButton btn1 = new JButton("마르게리따 피자");
	private JButton btn2 = new JButton("페페로니 피자");
	private JButton btn3 = new JButton("콤비네이션 피자");
	
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
