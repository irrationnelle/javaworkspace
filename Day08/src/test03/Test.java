package test03;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���: ");
		String inputString = scan.nextLine();
		
		int countAlphabet=0, countNum=0, countSpace=0;
		
		for(int i = 0; i<inputString.length(); i++) {
			char c = inputString.charAt(i);
			if((c>='a' && c<='z') || (c>='A'&&c<='Z')) {
				countAlphabet++;
			} else if (c>='0' && c<='9') {
				countNum++;
			} else if (c==' ') {
				countSpace++;
			}
		}
		
		System.out.println("���ĺ�: "+countAlphabet);
		System.out.println("����: "+countNum);
		System.out.println("����: "+countSpace);
	}
}
