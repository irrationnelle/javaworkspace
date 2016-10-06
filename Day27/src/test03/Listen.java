package test03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Listen extends Thread {
	private BufferedReader br;
	
	public Listen(Socket socket) {
		try {
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		} catch (IOException e) {
			System.out.println("BufferedReader fail!");
			e.printStackTrace();
		} 
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				String receiveMsg = br.readLine();
				System.out.println("Opponent: "+receiveMsg);
			} catch (IOException e) {
				System.out.println("Opponent exit! Listen end.");
				e.printStackTrace();				
			}
		}
	}
}
