package ex03;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class TestServer {
	public static void main(String[] args) {
		ServerSocket serverSocket;
		Socket socket;
		try {
			serverSocket = new ServerSocket(5555);
			socket = serverSocket.accept();
			Listen listen = new Listen(socket);
			Speak speak = new Speak(socket);
			MyFrame f = new MyFrame(listen, speak);
			listen.start();
			speak.start();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
