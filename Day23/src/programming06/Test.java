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
			System.out.print("1.�л����  2.�л�����  0.����");
			select = scan.nextInt();
			switch(select) {
			case 1:
				System.out.print("�̸� �Է�: ");
				String name = scan.next();
				System.out.print("����ȣ �Է�: ");
				String phoneNum = scan.next();
				System.out.print("�ּ� �Է�: ");
				String address = scan.next();
				
				array.add(new Student(name, phoneNum, address));
				break;
			case 2:
				System.out.print("������ �л� �̸� �Է�: ");
				String name = scan.next();
				for(Student st : array) {
					if(st.getName() == name) {
						
					}
					 
				}
			}
			
		}
	}
}
