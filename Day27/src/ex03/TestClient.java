package ex03;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class TestClient {
	public static void main(String[] args) {
		Socket socket;
		try {
			socket = new Socket(InetAddress.getByName("127.0.0.1"),5555);
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
