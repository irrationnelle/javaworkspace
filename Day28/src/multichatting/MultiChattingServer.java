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
	// ������ Ŭ���̾�Ʈ�� ����ŭ Thread�� �����ϰ�
	// Ŭ���̾�Ʈ�� �߰� �� ������ ������ �����Ͽ� Thread���� ������.
	private List<ChattingThread> threadList;

	// ���� ������
	public MultiChattingServer() {
		threadList = new ArrayList<>();
		
		try {
			serverSocket = new ServerSocket(5555);
			System.out.println("Wait for clients...");
			while(true) {
				Socket socket = serverSocket.accept();
				System.out.println("Client connected! IP: "+socket.getInetAddress());
				
				// ���ο� Ŭ���̾�Ʈ �����ϸ� ���ο� Thread ��ü�� �����ؼ� ����Ʈ�� �߰���.
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
	
	// Thread ��Ͽ��� Ư�� Thread �����ϱ�
	public void removeThread(ChattingThread t) {
		threadList.remove(t);
	}
	
	// �ϳ��� Ŭ���̾�Ʈ�� �������� �� ��� Thread Ŭ����
	class ChattingThread extends Thread {
		private String nickname;
		private BufferedReader br;
		private BufferedWriter bw;
		
		public ChattingThread(Socket socket) {
			// �����κ��� �ش� Ŭ���̾�Ʈ ���� ���� �޾Ƽ�
			// ä�� �ʱ�ȭ �۾� �����ϱ�
			try {
				br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		//���� Thread�� ����ϴ� Ŭ���̾�Ʈ���� �޼��� ������
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
				// ��� Ŭ���̾�Ʈ�� �������� ��
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
