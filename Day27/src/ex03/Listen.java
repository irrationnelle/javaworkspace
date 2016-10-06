package ex03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Listen extends Thread {
	private BufferedReader br;
	private String errorMessage;
	private String receiveMsg;
	
	public Listen(Socket socket) {
		try {
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		} catch (IOException e) {
			setErrorMessage("BufferedReader fail!");
			e.printStackTrace();
		}
	}
	
	@Override
	public void run() {
		try {
			while(true) {
				setReceiveMsg(br.readLine());
				MyFrame.textArea.append(receiveMsg);
//				System.out.println("Opponent: "+ receiveMsg);
			}
		} catch (IOException e) {
			setErrorMessage("Opponent exit! Listen end.");
			e.printStackTrace();
		}
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getReceiveMsg() {
		return receiveMsg;
	}

	public void setReceiveMsg(String receiveMsg) {
		this.receiveMsg = receiveMsg;
	}
}
