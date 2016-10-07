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
	private Socket socket;
	private BufferedReader br;
	private BufferedWriter bw;
	private List<MultiChattingThread> threadLists;
	
	public MultiChattingServer() {
		threadLists = new ArrayList<>();
		
		try {
			serverSocket = new ServerSocket(5555);

			System.out.println("Wait for Clients...");
			socket = serverSocket.accept();
			
			System.out.println("Client connected! IP: ");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void speak() {
		MultiChattingThread t = new MultiChattingThread();
		threadLists.add(t);
	}
	
	public void broadcast() {
		for(MultiChattingThread t : threadLists) {
			t.start();
		}
	}
	
	class MultiChattingThread extends Thread {
		private String nickname;
		private String receiveMsg;
		
		public MultiChattingThread() {
			try {
				br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		@Override
		public void run() {
			try {
				nickname = br.readLine();
				bw.write("[" + nickname+ "] entered");
				bw.flush();
				
				while(true) {
					receiveMsg = br.readLine();
					bw.write(nickname + ": " + receiveMsg);
					bw.flush();
				}
			} catch (IOException e) {
				threadLists.remove(this);
				e.printStackTrace();
			}
			
		}
	}
	
	public static void main(String[] args) {
		MultiChattingServer server = new MultiChattingServer();
		server.speak();
		server.broadcast();
	}
}
