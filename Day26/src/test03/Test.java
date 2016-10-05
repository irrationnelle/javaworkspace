package test03;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
	public static void main(String[] args) {
		BufferedReader br = null;
		
		try {
			// ���⼭ ���� �ٽ��� �Ǵ� �޼ҵ�� FileInputStream( )�̴�.
			br = new BufferedReader(new InputStreamReader(new FileInputStream("test.txt")));
			
			String msg = br.readLine();
			
			System.out.println("File Contents: "+msg);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
