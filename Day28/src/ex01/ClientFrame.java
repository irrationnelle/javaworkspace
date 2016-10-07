package ex01;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ClientFrame extends JFrame {
	// GUI Fields
	private JPanel inputPanel;
	private JPanel areaPanel;
	private JPanel btnPanel;
	private JTextArea textArea;
	private JTextField textField;
	private JButton btnSend;
	private JButton btnChangeNickname;
	
	// Network Fields
	private BufferedReader br;
	private BufferedWriter bw;
	private Socket socket;
	
	public ClientFrame() {
		//GUI 구현
		inputPanel = new JPanel();
		areaPanel = new JPanel();
		btnPanel = new JPanel();
		textArea = new JTextArea();
		textField = new JTextField();
		btnSend = new JButton("Send");
		btnChangeNickname = new JButton("Chg.Nick");
		
		textArea.setFont(new Font("Consolas", Font.PLAIN, 18));
		
		areaPanel.setLayout(new BorderLayout());
		areaPanel.add(new JScrollPane(textArea));
		
		btnPanel.setLayout(new BorderLayout());
		btnPanel.add(btnChangeNickname, BorderLayout.WEST);
		btnPanel.add(btnSend, BorderLayout.EAST); 
		
		textField.setBackground(Color.LIGHT_GRAY);
		textField.setFont(new Font("Consolas", Font.PLAIN, 18));
		
		inputPanel.setLayout(new BorderLayout());
		inputPanel.add(textField);
		inputPanel.add(btnPanel, BorderLayout.EAST);
		
		add(areaPanel, BorderLayout.CENTER);
		add(inputPanel, BorderLayout.SOUTH);
		
//		new JOptionPane().showInputDialog(parentComponent, message)
		
		//Network 구현
		try {
			socket = new Socket(InetAddress.getByName("127.0.0.1"), 5555);
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			while(true) {
				String receiveMsg;
				receiveMsg = br.readLine();
				textArea.setText(receiveMsg);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		setTitle("Exercise for multichatting");
		setSize(500, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	class MyListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				String sendMsg = textField.getText();
				textArea.setText(sendMsg+"\n");
				textField.setText("");
				bw.write(sendMsg + "\n");
				bw.flush();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
		
	}
	
	public static void main(String[] args) {
		ClientFrame clientframe = new ClientFrame();
	}

}
