package test05;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

public class UDPClientTest {
	public static void main(String[] args) {
		DatagramSocket sendSocket = null;
		DatagramSocket receiveSocket = null;
		
		try {
			sendSocket = new DatagramSocket();	// 보내는 쪽은 굳이 포트 번호 지정하지 않음.
			receiveSocket = new DatagramSocket(2222);
			
			Scanner scan = new Scanner(System.in);
			System.out.print("To Client: ");
			String sendMsg = scan.nextLine();
			
			//바이트 배열로 만들어주는 것.
			byte[] sendData = sendMsg.getBytes();
			// 첫번째 인자: 보내고자 하는 값, 두번째: 데이터 크기, 세번째: 아이피주소, 네번째: 포트번호
			// 본인 컴퓨터에 보낼 때에는 아이피 주소로 "127.0.0.1"을 사용한다.
			DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, InetAddress.getByName("70.12.109.107"), 1111);
			
			sendSocket.send(sendPacket);
			System.out.println("Send Complete!");
			
			// 클라이언트가 먼저 메세지를 보낸 후 답장 기다리기
			byte[] receiveData = new byte[256];
			DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
			
			System.out.println("Waiting reply...");
			receiveSocket.receive(receivePacket);
			
			System.out.println("Server reply: "+new String(receiveData));
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (UnknownHostException e) {	//서버의 IP주소가 잘못 되었을 경우를 산정함.
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(sendSocket != null) {
				sendSocket.close();
			}
		}
	}
}
