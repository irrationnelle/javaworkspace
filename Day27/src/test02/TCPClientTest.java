package test02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TCPClientTest {
	public static void main(String[] args) {
		try {
			// �ش� ������ ���ܾ��� �� ����Ǹ�  Ŭ���̾�Ʈ�� socket ��ü�� �ϳ� ������.
			Socket socket = new Socket(InetAddress.getByName("127.0.0.1"), 5555);
			
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			Scanner scan = new Scanner(System.in);
			while (true) {
				System.out.println("Message to send at Server: ");
				String sendMsg = scan.nextLine();

				bw.write(sendMsg + "\n");
				bw.flush();
				
				//�����κ��� ���� ���
				String receiveMsg = br.readLine();
				System.out.println("Received Message: "+receiveMsg);
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}
