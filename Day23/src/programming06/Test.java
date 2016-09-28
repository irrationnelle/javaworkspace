package programming06;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		ArrayList<Student> array = new ArrayList<Student>();
		
		boolean isContinued = true;
		int select=0;
		do {
			System.out.print("1.학생등록  2.학생삭제  0.종료");
			select = scan.nextInt();
			switch(select) {
			case 1:
				System.out.print("이름 입력: ");
				String name = scan.next();
				System.out.print("폰번호 입력: ");
				String phoneNum = scan.next();
				System.out.print("주소 입력: ");
				String address = scan.next();
				
				array.add(new Student(name, phoneNum, address));
				break;
			case 2:
				System.out.print("삭제할 학생 이름 입력: ");
				String name = scan.next();
				for(Student st : array) {
					if(st.getName() == name) {
						
					}
					 
				}
			}
			
		}
	}
}
