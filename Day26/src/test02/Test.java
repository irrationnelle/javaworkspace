package test02;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
	public static void main(String[] args) {
		BufferedInputStream in = null;
		BufferedOutputStream out = null;
		
		try {
			in = new BufferedInputStream(new FileInputStream("pixel.png"));
			out = new BufferedOutputStream(new FileOutputStream("copypixel.png"));
			
			int size;
			byte[] buf = new byte[256];
			
			while((size=in.read(buf)) != -1) {
				out.write(buf);
			}
			System.out.println("Copy Complete!");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {	// �ܺ��ڿ��� ������ ���� ������ �޸� ������ ���� ���� �׻� �ܺ� ������ �����־�� ��.
			if(in != null) {
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(out != null) {
				try {
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}