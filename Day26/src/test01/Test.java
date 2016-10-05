package test01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
	public static void main(String[] args) {
		FileInputStream in = null;
		FileOutputStream out = null;
		
		try {
			in = new FileInputStream("murakamicat.png");
			out = new FileOutputStream("copycat.png");
			
			int c;
			while((c=in.read()) != -1) {
				out.write(c);
			}
			System.out.println("Copy Complete!");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {	// 외부자원을 가져다 쓰기 때문에 메모리 누수를 막기 위해 항상 외부 연결을 끊어주어야 함.
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