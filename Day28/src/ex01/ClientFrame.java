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
		//GUI ±¸Çö
		inputPanel = new JPanel();
		areaPanel = new JPanel();
		btnPanel = new JPanel();
		textArea = new JTextArea();
		textField = new JTextField();
		btnSend = new JButton("Send");
		btnChangeNickname = new JButton("Chg.Nick");
		
		textArea.setFont(new Font("¸¼Àº°íµñ", Font.PLAIN, 18));
		
		areaPanel.setLayout(new BorderLayout());
		areaPanel.add(new JScrollPane(textArea));
		
		btnPanel.setLayout(new BorderLayout());
		btnPanel.add(btnChangeNickname, BorderLayout.WEST);
		btnPanel.add(btnSend, BorderLayout.EAST); 
		
		textField.setBackground(Color.LIGHT_GRAY);
		textField.setFont(new Font("¸¼Àº°íµñ", Font.PLAIN, 18));
		
		inputPanel.setLayout(new BorderLayout());
		inputPanel.add(textField);
		inputPanel.add(btnPanel, BorderLayout.EAST);
		
		add(areaPanel, BorderLayout.CENTER);
		add(inputPanel, BorderLayout.SOUTH);
		
		String nickname = JOptionPane.showInputDialog(this, "Input your Nickname: ", JOptionPane.INFORMATION_MESSAGE);
		MyListener listener = new MyListener();
		
		textField.addActionListener(listener);
		btnSend.addActionListener(listener);
		btnChangeNickname.addActionListener(listener);
		
		setTitle("Exercise for multichatting");
		setSize(500, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

		//Network ±¸Çö
		try {
			socket = new Socket(InetAddress.getByName("127.0.0.1"), 5555);
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			bw.write(nickname+ "\n");
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		new ListenThread().start();
	}
	
	class MyListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				if(e.getSource() == btnChangeNickname) {
					String newNick = JOptionPane.showInputDialog(null, "Input your Nickname: ");
					bw.write("*!chgxwyzma!*"+newNick+"\n");
					bw.flush();
				} else {
					String sendMsg = textField.getText();
					textField.setText("");
					bw.write(sendMsg + "\n");
					bw.flush();
				}
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
		
	}
	
	class ListenThread extends Thread {
		@Override
		public void run() {
			try {
				while(true) {
					String receiveMsg = br.readLine();
					textArea.append(receiveMsg+"\n");
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		new ClientFrame();
	}

}
