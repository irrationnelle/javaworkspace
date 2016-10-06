package ex01;

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
			Socket socket = new Socket(InetAddress.getByName("127.0.0.1"), 5555);
			
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			Scanner scan = new Scanner(System.in);
			
			System.out.print("Message to Server: ");
			String sendMsg = scan.nextLine();
			
			bw.write(sendMsg+"\n");
			bw.flush();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
