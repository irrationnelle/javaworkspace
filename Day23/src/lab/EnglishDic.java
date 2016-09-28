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
			System.out.print("1.단어추가 2.단어검색 3.단어삭제 0.종료: ");
			int select = sc.nextInt();
			switch(select) {
			case 1:
				System.out.print("영어단어: ");
				String eng = sc.next();
				System.out.print("한글뜻: ");
				String kor = sc.next();
				
				st.put(eng, kor);
				break;
			case 2:
				System.out.print("영어 단어를 입력하시오: ");
				String key = sc.next();
				if(key.equals("quit"))
					break;
				System.out.println("단어의 의미는 "+st.get(key));
				break;
			case 3:
				System.out.print("삭제할 단어를 입력하시오: ");
				String delete = sc.next();
				st.remove(delete);
				System.out.println("삭제되었습니다.");
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
