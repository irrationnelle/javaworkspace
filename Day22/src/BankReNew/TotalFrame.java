package BankReNew;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TotalFrame extends JFrame {
	public JButton btn1 = new JButton("1. ���� ����");
	public JButton btn2 = new JButton("2. �Ա�");
	public JButton btn3 = new JButton("3. ���");
	CreateAccDialog cad1;
	public static ArrayList<BankAccount> bankAccount = new ArrayList<BankAccount>(); 
	
	public TotalFrame() {
		setLayout(new FlowLayout());
		add(btn1);
		add(btn2);
		add(btn3);
		
		CallCreateAccDialog l = new CallCreateAccDialog();
		btn1.addActionListener(l);
		
		// ���� ������ ũ�� �� ����
		setTitle("����� ����");
		setSize(400, 150);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	class CallCreateAccDialog implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			cad1 = new CreateAccDialog();
		}
		
	}
}
