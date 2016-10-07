package ex01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class MultiChattingServer {
	private ServerSocket serverSocket;
//	private Socket socket; // 이렇게 할 경우 다른 Thread로 Socket 객체가 넘어감.
	private List<MultiChattingThread> threadLists;
	
	public MultiChattingServer() {
		threadLists = new ArrayList<>();
		
		try {
			serverSocket = new ServerSocket(5555);
			
			while(true) {
				System.out.println("Wait for Clients...");
				// Socket 클래스의 객체는 생성자의 지역 변수로 선언해야 각 Thread마다 고유의 Socket을 가진다.
				Socket socket = serverSocket.accept();
				
				System.out.println("Client connected! IP: "+socket.getInetAddress());
				MultiChattingThread t = new MultiChattingThread(socket);
				threadLists.add(t);
				t.start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	public void broadcast(String msg) {
		for(MultiChattingThread t : threadLists) {
			t.speak(msg);
		}
	}
	
	public void removeThread(MultiChattingThread t) {
		threadLists.remove(t);
	}
	
	class MultiChattingThread extends Thread {
		private String nickname;
//		private String receiveMsg;
		private BufferedReader br;
		private BufferedWriter bw;
		
		public MultiChattingThread(Socket socket) {
			try {
				br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		public void speak(String msg) {
			try {
				bw.write(msg + "\n");
				bw.flush();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		@Override
		public void run() {
			try {
				nickname = br.readLine();
				broadcast("[" + nickname+ "] entered");
				
				while(true) {
					String receiveMsg = br.readLine();
					if(receiveMsg.contains("*!chgxwyzma!*")) {
						broadcast("[" + nickname + "] changed own nickname to ["+receiveMsg.substring(13)+"]");
						nickname = receiveMsg.substring(13);
					} else {
						broadcast(nickname + ": " + receiveMsg);
					}
				}
			} catch (IOException e) {
//				threadLists.remove(this);
				removeThread(this);
				broadcast("["+ nickname+ "] exited");
				e.printStackTrace();
			}
			
		}
	}
	
	public static void main(String[] args) {
		MultiChattingServer server = new MultiChattingServer();
	}
}
