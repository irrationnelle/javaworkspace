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
			sendSocket = new DatagramSocket();	// ������ ���� ���� ��Ʈ ��ȣ �������� ����.
			receiveSocket = new DatagramSocket(2222);
			
			Scanner scan = new Scanner(System.in);
			System.out.print("To Client: ");
			String sendMsg = scan.nextLine();
			
			//����Ʈ �迭�� ������ִ� ��.
			byte[] sendData = sendMsg.getBytes();
			// ù��° ����: �������� �ϴ� ��, �ι�°: ������ ũ��, ����°: �������ּ�, �׹�°: ��Ʈ��ȣ
			// ���� ��ǻ�Ϳ� ���� ������ ������ �ּҷ� "127.0.0.1"�� ����Ѵ�.
			DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, InetAddress.getByName("70.12.109.107"), 1111);
			
			sendSocket.send(sendPacket);
			System.out.println("Send Complete!");
			
			// Ŭ���̾�Ʈ�� ���� �޼����� ���� �� ���� ��ٸ���
			byte[] receiveData = new byte[256];
			DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
			
			System.out.println("Waiting reply...");
			receiveSocket.receive(receivePacket);
			
			System.out.println("Server reply: "+new String(receiveData));
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (UnknownHostException e) {	//������ IP�ּҰ� �߸� �Ǿ��� ��츦 ������.
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
