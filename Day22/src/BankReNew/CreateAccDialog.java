package BankReNew;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CreateAccDialog extends JDialog {
	
	JLabel _name = new JLabel("Name");
	JTextField _setName = new JTextField(8);
	JLabel _password = new JLabel("Password");
	JTextField _setPassword = new JTextField(8);
	JLabel _amount = new JLabel("Amount");
	JTextField _setAmount = new JTextField(8);
	JButton complete = new JButton("Complete");
	BankAccount ac1;
	
	public CreateAccDialog() {
		// TODO Auto-generated constructor stub
		setLayout(new FlowLayout());
		add(_name);
		add(_setName);
		add(_password);
		add(_setPassword);
		add(_amount);
		add(_setAmount);
		add(complete);
		
		SetAccountInfo l = new SetAccountInfo();
		complete.addActionListener(l);
		
		setSize(200, 300);
		setTitle("∞Ë¡¬ ∞°¿‘");
		setModal(true);
		setVisible(true);
		
	}
	
	class SetAccountInfo implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			TotalFrame.bankAccount.add(new BankAccount(_setName.getText(), Integer.parseInt(_setPassword.getText()), Integer.parseInt(_setAmount.getText())));
			dispose();
		}
		
	}
}
