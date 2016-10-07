package multichatting;

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
	// 서버는 클라이언트의 수만큼 Thread를 유지하고
	// 클라이언트가 추가 될 때마다 소켓을 생성하여 Thread에게 전달함.
	private List<ChattingThread> threadList;

	// 서버 생성자
	public MultiChattingServer() {
		threadList = new ArrayList<>();
		
		try {
			serverSocket = new ServerSocket(5555);
			System.out.println("Wait for clients...");
			while(true) {
				Socket socket = serverSocket.accept();
				System.out.println("Client connected! IP: "+socket.getInetAddress());
				
				// 새로운 클라이언트 접속하면 새로운 Thread 객체를 생성해서 리스트에 추가함.
				ChattingThread t = new ChattingThread(socket);
				threadList.add(t);
				t.start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void broadcast(String msg) {
		for(ChattingThread t: threadList) {
			t.speak(msg);
		}
	}
	
	// Thread 목록에서 특정 Thread 삭제하기
	public void removeThread(ChattingThread t) {
		threadList.remove(t);
	}
	
	// 하나의 클라이언트가 접속했을 때 담당 Thread 클래스
	class ChattingThread extends Thread {
		private String nickname;
		private BufferedReader br;
		private BufferedWriter bw;
		
		public ChattingThread(Socket socket) {
			// 서버로부터 해당 클라이언트 소켓 전달 받아서
			// 채팅 초기화 작업 수행하기
			try {
				br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		//현재 Thread가 담당하는 클라이언트에게 메세지 보내기
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
				broadcast("[" + nickname + "] entered");
				while(true) {
					String msg = br.readLine();
					broadcast(nickname + ": " + msg);
				}
			} catch (IOException e) {
				// 담당 클라이언트가 퇴장했을 때
				removeThread(this);
				broadcast("[" + nickname + "] exited");
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		MultiChattingServer server = new MultiChattingServer();
	}
}
