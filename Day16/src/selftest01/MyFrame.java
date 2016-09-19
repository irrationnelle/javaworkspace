package selftest01;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyFrame extends JFrame {
	private JButton leftBtn = new JButton("Left");
	private JButton centerBtn = new JButton("Center");
	private JButton	rightBtn = new JButton("Right");
	private JTextField t1 = new JTextField(10); // 텍스트 입력 필드
	
	public MyFrame() {
		add(leftBtn);
		add(centerBtn);
		add(rightBtn);
		add(t1);
		
		rightBtn.setEnabled(false);
		
		setSize(300, 200);
		setTitle("Test Frame");
		setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
}
