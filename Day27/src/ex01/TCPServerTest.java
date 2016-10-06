package ex01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServerTest {
	public static void main(String[] args) {
		try {
			ServerSocket serverSocket = new ServerSocket(5555);
			System.out.println("Waiting Client...");
			
			Socket socket = serverSocket.accept();
			System.out.println("Client connected!");
			
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			String receivedMsg = br.readLine();
			System.out.println("Message from client: "+receivedMsg);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
