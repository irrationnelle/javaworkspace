package lab;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EnglishDic {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, String> st = new HashMap<String, String>();
		
		boolean isSelected=true;
		do {
			System.out.print("1.�ܾ��߰� 2.�ܾ�˻� 3.�ܾ���� 0.����: ");
			int select = sc.nextInt();
			switch(select) {
			case 1:
				System.out.print("����ܾ�: ");
				String eng = sc.next();
				System.out.print("�ѱ۶�: ");
				String kor = sc.next();
				
				st.put(eng, kor);
				break;
			case 2:
				System.out.print("���� �ܾ �Է��Ͻÿ�: ");
				String key = sc.next();
				if(key.equals("quit"))
					break;
				System.out.println("�ܾ��� �ǹ̴� "+st.get(key));
				break;
			case 3:
				System.out.print("������ �ܾ �Է��Ͻÿ�: ");
				String delete = sc.next();
				st.remove(delete);
				System.out.println("�����Ǿ����ϴ�.");
				break;
			case 0:
				isSelected = false;
				break;
			default:
				break;
			}
		} while(isSelected);
		
	}
}
