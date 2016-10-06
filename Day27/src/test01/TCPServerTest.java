package test01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServerTest {
	public static void main(String[] args) {
		try {
			//TCP 통신에서는 서버가 특정 포트를 점유하고 먼저 실행되서 기다리고 있음.
			ServerSocket serverSocket = new ServerSocket(5555);
			
			System.out.println("Server wait...");
			// 서버가 기다림. 서버가 클라이언트 요청(accpet())를 받으면 Socket 객체에 대입 연산 진행
			Socket socket = serverSocket.accept();
			System.out.println("Client connected!");
			
			// 이 후로는 클라이언트와 완전히 같은 소스 코드를 가진다.
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			while(true) {
				//클라이언트가 보내는 문장 한줄을 수신대기
				String receiveMsg = br.readLine();
				System.out.println("Received Message: "+receiveMsg);
			}
			
		} catch (IOException e) {	// 5555번 포트가 이미 사용중일 수 있기 때문에 예외처리
			System.out.println("Client disconnected!");
			e.printStackTrace();
		}
	}
}
