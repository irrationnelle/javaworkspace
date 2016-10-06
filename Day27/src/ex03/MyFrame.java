package ex03;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener, KeyListener{
	private JPanel outputPanel = new JPanel();
	private JPanel inputPanel = new JPanel();
	private JPanel totalPanel = new JPanel();
	public static JTextArea textArea = new JTextArea();
	private JTextField textField = new JTextField(20);
	private JButton sendButton = new JButton("Send");
	public static String sendMsg;
	private Listen listen;
	private Speak speak;
	
	public MyFrame(Listen listen, Speak speak) {
		this.listen = listen;
		this.speak = speak;
		
		textArea.setEditable(false);
		textArea.setBackground(Color.WHITE);
		textField.setBackground(Color.PINK);
		
		add(new JScrollPane(textArea), BorderLayout.CENTER);
		
		sendButton.addActionListener(this);
		textField.addKeyListener(this);
		
		inputPanel.setLayout(new BorderLayout());
		inputPanel.add(textField, BorderLayout.WEST);
		inputPanel.add(sendButton, BorderLayout.EAST);
		
		
		add(inputPanel, BorderLayout.SOUTH);
		
		setTitle("Chat!");
		setSize(300, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static String getSendMsg() {
		return sendMsg;
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		switch(e.getKeyCode()) {
		case KeyEvent.VK_ENTER:
			sendMsg = textField.getText();
			listen.setReceiveMsg(textField.getText());
			textArea.append("Me: "+textField.getText()+"\n");
			textField.setText("");
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		sendMsg = textField.getText();
		listen.setReceiveMsg(textField.getText());
		textArea.append("Me: "+textField.getText()+"\n");
		textField.setText("");
	}
}
