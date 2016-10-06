package test03;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Speak extends Thread {
	private BufferedWriter bw;
	
	public Speak(Socket socket) {
		try {
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		} catch (IOException e) {
			System.out.println("BufferedWriter fail!");
			e.printStackTrace();
		}
	}
	
	@Override
	public void run() {
		Scanner scan = new Scanner(System.in);
		
		try {
			while(true) {
				System.out.println("Me: ");
				String sendMsg = scan.nextLine();
				
				bw.write(sendMsg + "\n");
				bw.flush();
			}
		} catch (IOException e) {
			System.out.println("Not connected or opponent out");
			e.printStackTrace();
		}
	}
}
