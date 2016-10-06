package test01;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TCPClientTest {
	public static void main(String[] args) {
		try {
			// 해당 문장이 예외없이 잘 진행되면  클라이언트는 socket 객체를 하나 가진다.
			Socket socket = new Socket(InetAddress.getByName("127.0.0.1"), 5555);
			
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			while (true) {
				Scanner scan = new Scanner(System.in);
				System.out.println("Message to send at Server: ");
				String sendMsg = scan.nextLine();

				bw.write(sendMsg + "\n");
				bw.flush();
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}
