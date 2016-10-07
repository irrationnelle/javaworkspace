package multichatting;

import java.awt.BorderLayout;
import java.awt.Color;
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
	private JPanel panelArea;
	private JPanel panelInput;
	private JTextArea chatArea;
	private JTextField chatField;
	private JButton btnSend;
	
	// TCP Network Fields
	private BufferedReader br;
	private BufferedWriter bw;
	
	// Constructor initiating work
	public ClientFrame() {
		panelArea = new JPanel();
		panelInput = new JPanel();
		chatArea = new JTextArea();
		chatArea.setEditable(false);
		chatField = new JTextField();
		btnSend = new JButton("Send");
		
		// �̺�Ʈ ó��(�������� �޼��� ������ �۾�) ���
		ChattingListener listener = new ChattingListener();
		chatField.addActionListener(listener);
		btnSend.addActionListener(listener);
		
		//GUI �߰�
		chatField.setBackground(Color.LIGHT_GRAY);
		
		panelArea.setLayout(new BorderLayout());
		panelArea.add(new JScrollPane(chatArea));
		
		panelInput.setLayout(new BorderLayout());
		panelInput.add(chatField);
		panelInput.add(btnSend, BorderLayout.EAST);
		
		add(panelArea, BorderLayout.CENTER);
		add(panelInput, BorderLayout.SOUTH);
		
		setTitle("Multi-chatting Client Frame");
		setSize(300,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		// �������� ����� ���� ��Ʈ��ũ ���� �κ�
		try {
			Socket socket = new Socket(InetAddress.getByName("70.12.109.123"), 1234);
			
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			// ������ ������ �Ŀ� �г��� �Է��ؼ� �����ϱ�
			String nickname = JOptionPane.showInputDialog(this, "Input your nickname.", JOptionPane.INFORMATION_MESSAGE);
			
			bw.write(nickname+"\n");
			bw.flush();
			
			// �г��� ���� �Ŀ��� ������ ������ �޼��� �޴� Thread
			new ListenThread().start();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// �̺�Ʈ ó�� Ŭ����(ä�� ���� �������� ������)
	class ChattingListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			String msg = chatField.getText();
			chatField.setText("");
			
			try {
				bw.write(msg+"\n");
				bw.flush();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	//�����κ��� �޼����� �޴� ���� Thread Ŭ����
	class ListenThread extends Thread {
		@Override
		public void run() {
			String receiveMsg;
			try {
				while(true) {
					receiveMsg = br.readLine();
					chatArea.append(receiveMsg+"\n");
					chatArea.setCaretPosition(chatArea.getText().length());
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
