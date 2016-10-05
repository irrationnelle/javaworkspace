package test06;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class ServerTest {
	public static void main(String[] args) {
		DatagramSocket receiveSocket = null;
		DatagramSocket sendSocket = null;
		
		try {
			receiveSocket = new DatagramSocket(1111);
			sendSocket = new DatagramSocket();
			
			byte[] receiveData = new byte[256];
			DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
			
			System.out.println("waiting for response...");
			receiveSocket.receive(receivePacket);
			
			System.out.println("Received!");
			System.out.println("From Client: "+new String(receiveData));
			
			
			
			byte[] sendData = new byte[256];
			
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			receiveSocket.close();
		}
		
	}
}
