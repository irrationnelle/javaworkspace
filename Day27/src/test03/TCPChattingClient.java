package test03;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPChattingClient {
	public static void main(String[] args) {
		try {
			Socket socket = new Socket(InetAddress.getByName("127.0.0.1"), 9999);
			System.out.println("Arrived to Server!");
			System.out.println("Chatting Start!");
			
			new Speak(socket).start();
			new Listen(socket).start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
