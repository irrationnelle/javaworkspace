package ex03;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class Speak extends Thread {
	private BufferedWriter bw;
	private String errorMsg;
	private String sendMsg;
		
	public Speak(Socket socket) {
		try {
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		} catch (IOException e) {
			setErrorMsg("BufferedWriter fail!");
			e.printStackTrace();
		}
	}
	
	public void setSendMsg() {
		this.sendMsg = MyFrame.getSendMsg();
	}
	
	@Override
	public void run() {
		try {
			while(true) {
				setSendMsg();
				if(sendMsg == null) {
					sendMsg = "";
				}
				bw.write(sendMsg);
				bw.flush();
			}
		} catch (IOException e) {
			setErrorMsg("Not connected or opponent out");
			e.printStackTrace();
		}
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
}
