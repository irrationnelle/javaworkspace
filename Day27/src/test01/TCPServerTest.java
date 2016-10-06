package test01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServerTest {
	public static void main(String[] args) {
		try {
			//TCP ��ſ����� ������ Ư�� ��Ʈ�� �����ϰ� ���� ����Ǽ� ��ٸ��� ����.
			ServerSocket serverSocket = new ServerSocket(5555);
			
			System.out.println("Server wait...");
			// ������ ��ٸ�. ������ Ŭ���̾�Ʈ ��û(accpet())�� ������ Socket ��ü�� ���� ���� ����
			Socket socket = serverSocket.accept();
			System.out.println("Client connected!");
			
			// �� �ķδ� Ŭ���̾�Ʈ�� ������ ���� �ҽ� �ڵ带 ������.
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			while(true) {
				//Ŭ���̾�Ʈ�� ������ ���� ������ ���Ŵ��
				String receiveMsg = br.readLine();
				System.out.println("Received Message: "+receiveMsg);
			}
			
		} catch (IOException e) {	// 5555�� ��Ʈ�� �̹� ������� �� �ֱ� ������ ����ó��
			System.out.println("Client disconnected!");
			e.printStackTrace();
		}
	}
}
