package test01;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class MyFrame extends JFrame {
	private TextArea textArea = new TextArea();
	private TextField textField = new TextField();
	
	public MyFrame() {
		textArea.setEditable(false);
		textArea.setFont(new Font("Consolas", Font.BOLD, 20));
		textField.setSize(300, 100);
		textField.setBackground(Color.PINK);
		MyListener listener = new MyListener();
		textField.addActionListener(listener);
		
		add(textArea, BorderLayout.CENTER);
		add(textField, BorderLayout.PAGE_END);
		
		setSize(300,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	class MyListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			textArea.append(textField.getText()+"\n");
			textField.setText("");
		}
		
	}
}
