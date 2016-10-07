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
		
		// 이벤트 처리(서버에게 메세지 보내는 작업) 등록
		ChattingListener listener = new ChattingListener();
		chatField.addActionListener(listener);
		btnSend.addActionListener(listener);
		
		//GUI 추가
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
		
		// 서버와의 통신을 위한 네트워크 설정 부분
		try {
			Socket socket = new Socket(InetAddress.getByName("70.12.109.123"), 1234);
			
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			// 서버와 연결한 후에 닉네임 입력해서 전송하기
			String nickname = JOptionPane.showInputDialog(this, "Input your nickname.", JOptionPane.INFORMATION_MESSAGE);
			
			bw.write(nickname+"\n");
			bw.flush();
			
			// 닉네임 전송 후에는 서버가 보내는 메세지 받는 Thread
			new ListenThread().start();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// 이벤트 처리 클래스(채팅 내용 서버에게 보내기)
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
	
	//서버로부터 메세지를 받는 내부 Thread 클래스
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
