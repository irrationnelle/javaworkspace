package ex02;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Speak extends Thread {
	private BufferedWriter bw;

	public Speak(Socket socket) {
		try {
			bw = new BufferedWriter(
					new OutputStreamWriter(socket.getOutputStream()));
		} catch (IOException e) {
			System.out.println("BufferedWriter Fail");
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		Scanner scan = new Scanner(System.in);

		try {
			while (true) {
				System.out.print("Me:");
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
