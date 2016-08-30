import java.util.Scanner;

class Check{
	int countFinal;
	
	public void setCount(String text, int element) {
		int count=0;
		int len = text.length();
		for(int i=0; i<len; i++) {
			switch(element) {
			case 1:
				boolean checkAlphabet = ((text.charAt(i) >= 97 && text.charAt(i) <= 122) || (text.charAt(i) >= 65 && text.charAt(i) <= 90));
				if(checkAlphabet){
					count++;
				}
				break;
			case 2:
				boolean checkNumber = (text.charAt(i) >=48 && text.charAt(i) <=57);
				if(checkNumber){
					count++;
				}
				break;
			case 3:
				boolean checkSpace = (text.charAt(i) == ' ');
				if(checkSpace) {
					count++;
				}
				break;
			}
		}
		countFinal = count;
	}
	
	public int getCount() {
		return countFinal;
	}
}	

public class Programming03 {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���ڿ� �Է�: ");
		String text = scan.nextLine();
		
		Check c = new Check();
		
		c.setCount(text, 1);
		int countAlphabet = c.getCount();
		c.setCount(text, 2);
		int countNumber = c.getCount();
		c.setCount(text, 3);
		int countSpace = c.getCount();
		
		System.out.println("���ĺ� ����: "+countAlphabet);
		System.out.println("���� ����: "+countNumber);
		System.out.println("���� ����: "+countSpace);
	}
}