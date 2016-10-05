package test05;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.Scanner;

public class UDPServerTest {
	public static void main(String[] args) {
		// �������̵�
		DatagramSocket receiveSocket = null;
		DatagramSocket sendSocket = null;
		
		try {
			// �ش� ������ �̹� ��� ���� �� �ֱ� ������ ���� �߻�
			receiveSocket = new DatagramSocket(1111);	// 1111�� ��Ʈ ����
			sendSocket = new DatagramSocket();	// ������ ���� ��Ŷ�� ���� ����� �� ���� � ��Ʈ�� �ᵵ ��� ����.
			
			byte[] receiveData = new byte[256];	// ������ ũ��
			
			//����ִ� ��Ŷ�� ���� �����Ͱ� �����ϸ� ��⵵�� ��.
			DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
			
			System.out.println("Waiting...");
			//�� ��Ŷ�� ������ ���Ͽ��� ��ٸ�. Ŭ���̾�Ʈ�� ��Ŷ�� ���� ������ ȣ������ ����.
			receiveSocket.receive(receivePacket);
			
			System.out.println("Received!");
			System.out.println("Client: "+new String(receiveData));
			
			// ���� ����� ������ �޼����� ���� �� ������ ������
			Scanner scan = new Scanner(System.in);
			System.out.print("Server reply: ");
			String sendMsg = scan.nextLine();
			
			byte[] sendData = sendMsg.getBytes();
			// ������ Ŭ���̾�Ʈ�κ��� ��Ŷ�� ���� �� �̹� Ŭ���̾�Ʈ�� ip �ּҸ� �˰� �ֱ� ������ ����° ���ڷ� getAddress( )�޼ҵ带 ����Ѵ�.
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
