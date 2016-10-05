package test05;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.Scanner;

public class UDPServerTest {
	public static void main(String[] args) {
		// 서버사이드
		DatagramSocket receiveSocket = null;
		DatagramSocket sendSocket = null;
		
		try {
			// 해당 소켓이 이미 사용 중일 수 있기 때문에 예외 발생
			receiveSocket = new DatagramSocket(1111);	// 1111번 포트 점유
			sendSocket = new DatagramSocket();	// 서버가 받은 패킷을 통해 답신을 할 때는 어떤 포트를 써도 상관 없음.
			
			byte[] receiveData = new byte[256];	// 임의의 크기
			
			//비어있는 패킷을 만들어서 데이터가 도착하면 담기도록 함.
			DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
			
			System.out.println("Waiting...");
			//빈 패킷을 가지고 소켓에서 기다림. 클라이언트가 패킷을 보낼 때까지 호출하지 않음.
			receiveSocket.receive(receivePacket);
			
			System.out.println("Received!");
			System.out.println("Client: "+new String(receiveData));
			
			// 먼저 실행된 서버가 메세지를 받은 후 답장을 보내기
			Scanner scan = new Scanner(System.in);
			System.out.print("Server reply: ");
			String sendMsg = scan.nextLine();
			
			byte[] sendData = sendMsg.getBytes();
			// 서버는 클라이언트로부터 패킷을 받을 때 이미 클라이언트의 ip 주소를 알고 있기 때문에 세번째 인자로 getAddress( )메소드를 사용한다.
			DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, receivePacket.getAddress(), 2222);
			sendSocket.send(sendPacket);
			System.out.println("Reply Complete!");
			
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (receiveSocket != null) {
				receiveSocket.close();
			}
		}
	}
}
