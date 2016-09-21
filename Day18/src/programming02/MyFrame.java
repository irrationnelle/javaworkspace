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
	private JLabel label1 = new JLabel("������ �Է��Ͻÿ�.");
	private JLabel label2 = new JLabel("������ �Է��Ͻÿ�.");
	private JButton button = new JButton("Result");
	private JTextField textPrincipal = new JTextField(10);
	private JTextField textInterest = new JTextField(10);
	private JTextField textResult = new JTextField("���ڴ� �� 75�����Դϴ�.");
	
	public MyFrame() {
		setTitle("���� ����");
		setSize(300, 200);

		pl1.add(label1);
		pl1.add(getTextPrincipal());
		pl2.add(label2);
		pl2.add(getTextInterest());
		pl3.add(getButton());
		pl4.add(getTextResult());
		
		totalPanel.add(pl1);
		totalPanel.add(pl2);
		totalPanel.add(pl3);
		totalPanel.add(pl4);
		totalPanel.setLayout(new BoxLayout(totalPanel, BoxLayout.Y_AXIS));
		
		add(totalPanel);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public JButton getButton() {
		return button;
	}

	public void setButton(JButton button) {
		this.button = button;
	}

	public JTextField getTextPrincipal() {
		return textPrincipal;
	}

	public void setTextPrincipal(JTextField textPrincipal) {
		this.textPrincipal = textPrincipal;
	}

	public JTextField getTextInterest() {
		return textInterest;
	}

	public void setTextInterest(JTextField textInterest) {
		this.textInterest = textInterest;
	}

	public JTextField getTextResult() {
		return textResult;
	}

	public void setTextResult(JTextField textResult) {
		this.textResult = textResult;
	}
}
