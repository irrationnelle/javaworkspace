package programming02;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyFrame extends JFrame {
	private JPanel pl1 = new JPanel();
	private JPanel pl2 = new JPanel();
	private JPanel pl3 = new JPanel();
	private JPanel pl4 = new JPanel();
	private JPanel totalPanel= new JPanel();
	private JLabel label1 = new JLabel("원금을 입력하시오.");
	private JLabel label2 = new JLabel("이율을 입력하시오.");
	private JButton button = new JButton("Result");
	private JTextField text1 = new JTextField("1000        ");
	private JTextField text2 = new JTextField("7.5         ");
	private JTextField text3 = new JTextField("이자는 연 75만원입니다.");
	
	public MyFrame() {
		// TODO Auto-generated constructor stub
		setTitle("이자 계산기");
		setSize(300, 200);
		pl1.add(label1);
		pl1.add(text1);
		pl2.add(label2);
		pl2.add(text2);
		pl3.add(button);
		pl4.add(text3);
		totalPanel.add(pl1);
		totalPanel.add(pl2);
		totalPanel.add(pl3);
		totalPanel.add(pl4);
		totalPanel.setLayout(new BoxLayout(totalPanel, BoxLayout.Y_AXIS));
		
		add(totalPanel);
		setVisible(true);
	}
}
